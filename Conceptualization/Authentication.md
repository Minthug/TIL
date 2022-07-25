# Spring Security의 인증 처리 흐름
![](https://velog.velcdn.com/images/minthug94_/post/ca104020-0033-4e4a-8b43-578d4b315064/image.webp)


### 인증 처리 Step

1. 사용자가 username 과 password를 통해 인증을 요청한다

2. AuthenticationFilter의 구현체인 UsernamePasswrodAuthenticationFilter는 
전달받은 Username && Password를 가지고 
UsernamePasswordAuthenticaitonToken을 생성한다.

3. 생성된 Authentication 을 AuthenticationManager에 전달한다

4. AuthenticationManager 는 전달받은 Authentication을 다수의 
AuthenticationProvider 에 전달하여 유효성 검증 및 처리를 위임한다

5. 입력받은 사용자의 인증 정보의 유효성 검증을 위해 UserDetailsService로 
전달한다

6. UserDetailsService는 loadUserByUsename() 메소드를 통해 사용자 정보를 
조회하여 실제 존재하는 사용자인지, Username과 Password가 유효한지 
검증한다.

7. 만약 6 에서 사용자의 인증 정보 검증이 성공적으로 이루어졌다면 해당 
사용자 정보를 활용해서 UserDetails를  생성한다

8. 생성된 UserDetails를 다시 AuthenticationProvider에게 전달한다.

9. authenticate() 메소드가 호출되며 (UserDetails 와 Authorities) 로 생성한 
Authentication을 AuthenticationManager에게 전달한다.

10. AuthenticationManager는 생성된 Authentication 을 
AuthenticationFilter에게 전달한다.

11. AuthenticationFilter는 인증 처리가 모두 완료되어 해당 사용자의 인증 
정보를 담고 있는 Authentication을 SecurityContext에 저장한다.

-------------------
## Authentication 
Spring Security에서 Authentication 은 인터페이스로 존재하며 사용자가 
인증을 성공적으로 수행하게 되면, 사용자의 인증 정보에 관련된 정보를 가지고 
있다.

![](https://velog.velcdn.com/images/minthug94_/post/5f092037-174a-4696-8233-5c9d036b10b4/image.png)

- Principal : 사용자를 식별한다, 사용자의 고유 식별자와 암호로 인증이 
이루어지면 일반적으로 UserDetails 인터페이스의 구현체이다.
구현체로는 <code>org.springframework.security.core.userdetails.User</code>
클래스가 있고 또한 직접 UserDetails 를 상속받아 구현할 수 있다.

- credentials : 암호이며, 사용자의 인증이 이루어진 후 지워진다.

- Authorities : AuthenticationManager 에 의해 부여된 인가에 대한 정보이다. 
부여된 권한에 대한 정보는 GrantedAuthority 로 추상화한다.
일반적으로 사용되는 구현체는 SimpleGrantedAuthority 이다.

```java
public interface GrantedAuthority extends Serializable {
	String getAuthority();
}
```


일반적으로 많이 사용되는 구현체는 UsernamePasswordAuthenticationToken 이다
UsenamePasswordAuthenticationToken 은 사용자의 고유 식별자(Username) 와 
암호(Password)로 간단하게 Authentication 객체를 생성할 수 있다.


> Authentication 인증
Spring Security는 사용자 인증 처리를 기본적으로 제공한다
- 스프링 시큐리티는 종합적인 인증 처리를 지원한다
- 인증은 특정 리소스에 접근하려고 하는 사용자가 누구인지를 확인할때 
사용한다
- 보통 사용자가 이름과 비밀번ㅇ호를 입력하는 것으로 사용자를 인증한다
- 한번 인증하면 사용자를 식별하고 권한을 부여할 수 있다, 이 과정은 
authorization '인가'라 한다


## Password Storage
Spring Security의 PasswordEncoder Interface는 비밀번호를 안전하게 저장할 
수 있도록 [단방향 변환](.)을 수행해준다.

- PasswordEncoder는 비밀번호를 단방향으로 변환한다
- 인증에 사용할 credential 정보를 저장한다

PasswordEncoder 를 사용해서 저장하는 비밀번호는 인증 시점에 사용가자 
입력하는 비밀번호와 비교하는 용도로 사용된다.

