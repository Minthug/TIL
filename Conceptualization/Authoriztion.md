# Spring Security Authorization 인가 처리 절차

![](https://velog.velcdn.com/images/minthug94_/post/4ffb3c6a-0b63-4271-b644-5231e021599d/image.png)

1. 사용자가 HTTP Request를 한다
2. FilterSecurityInterceptor는 SecurityContextHolder 로 부터 
Authentication을 얻는다
3. FilterSecurityInterceptor는 FilterInvocation을 생성한다
4. FilterInvocation을 SecurityMetadataSource에 전달하고 ConfigAttribute를 
생성한다, ConfigAttribute는 다수가 존재할 수 있다.
5. Authentication, ConfigAttribute를 AccessDecisionManager로 전달한다
6. AccessDecisionManager는 decide(Authentication, Collection) 메소드를 
호출해 AccessDecisionVoter에 처리를 위임한다, AccessDecisionVoter ㄸ환 
여러개 일 수 있다.
7. 각 AccessDecisionVoter는 vote() 메서드를 호출해 해당 Authentication의 
Authorites 와 ConfigAttribute 목록들을 비교해 접근 권한을 부여하거나 
제한한다
7-1. 권한이 존재하는 경우엔 AccessDecisionManager에 
<code>ACCESS_GRANTED</code>를 전달
7-2. 권한이 존재하지 않는 경우엔 AccessDeniedException 예외를 발생 시킨다.

-----------------
## Authorization
Authentication과 비슷하지만 Authorization은 특정 요청의 주체인 
클라이언트의 접근 권한을 검증하는데 필요로 한다.

### Authorities
- GrantedAuthority 객체는 principal 에게 부여한 권한을 나타낸다
GrandtedAuthority는 메서드가 1개만 있는 Interface이다.
```java
public interface GrantedAuthority extends Serializable {

String getAuthority();
}
```

- 인증 
AuthenticationManager가 Authentication 객체에 설정 해준다.

- 인가
AccessDecisionManager가 해당 Authentication 객체에서 GrantedAuthority를 
꺼내서 접근 권한을 결정한다

String으로 쉽게 GrantedAuthority를 조회한다
복잡한 케이스로 간주된 경우엔 getAuthority() 메서드에서 null을 리턴한다.
> 고객 계정 번호에 따라 적용할 작업과 권한 임계치 리스트를 저장하는 일 
등이 있을 수 있다.
null을 리턴했다는 것은 복잡한 GrantedAuthority를 의미하고 
AccessDecisionManager에 구체적인 코드가 있어야 한다는 뜻이다.

한 가지 GrantedAuthority 구현체와 SimpleGrantedAuthority 를 제공한다
사용자가 지정한 String을 GrantedAuthority로 변환해준다, Security 
Architecture 에 속한 모든 AuthenticationProvider는 Authentication 객체에 
값을 채울 때 SimpleGrantedAuthority를 사용한다

-------------------

## SimpleGrantedAuthority
```java
public final class SimpleGrantedAuthority implements GrantedAuthority {

	private static final long serialVersionUID = 
SpringSecurityCoreVersion.SERIAL_VERSION_UID;

	private final String role;

	public SimpleGrantedAuthority(String role) {
		Assert.hasText(role, "A granted authority textual 
representation is required");
		this.role = role;
	}

	@Override
	public String getAuthority() {
		return this.role;
	}

```
SimpleGrantedAuthority 클래스는 String 형태의 사용자의 권한에 해당하는 
문자열을 GrantedAuthority 로 반환해준다.

## Pre-Invocation Handling
Spring Security는 method invocation이나 웹 요청 같은 보안 객체에 대한 
접근을 제어하는 인터셉터를 제공한다
이에 호출을 허용할지 말지를 결정하는 pre-invocation 결정은 
AccessDecisionManager에서 결정을 한다

# AccessDecisionManager
AbstractSecurityInterceptor에서 호출되며 최종적인 접근 제어를 결정한다

```java
void decide(Authentication authentication, Object secureObject, 
Collection<ConfigAttribute> attrs) throws AccessDeniedException;

boolean supports(ConfigAttribute attribute);

boolean supports(Class clazz);
```
- <code>decide</code>
권한 부여하기 위한 결정을 내리는 데 필요한 모든 정보가 메서드에 전달된다, 
secureObject를 전달하면 실제 보안 객체를 실행할 때 인자를 검사할 수 있다.

- <code>supprots(ConfigAttribute)</code>
기동 시점에 AbstractSecurityInterceptor가 호출하며 AccessDecisionManager가 
전달되 ConfigAttribute의 처리 가능 여부를 결정한다

- <code>supports(Class)</code>
Security interceptor 구현체가 호출하며 설정해둔 AccessDecisionManager에서 
Security interceptor가 제출할 보안 객체 타입을 지원하는지 확인한다


