# Filter
Spring Security 는 Servlet Filter를 기반으로 서블릿을 지원하므로, Filter의 
역할을 이해하면 이해해 도움이 될 것이다.
### Filter란, HTTP 요청과 응답을 변경할 수 있는 재사용 가능한 코드

![](https://velog.velcdn.com/images/minthug94_/post/a904f38a-5455-4b4a-a995-5887bfe960bd/image.png)

- 클라이언트가 서버로 요청을 하게되면 가장 먼저 Servlet Filter를 거치게 
된다
- Filter를 모두 거치고 난 후, DispatcherServlet 과 같은 Servlet에서 요청이 
처리된다
- Spring Security는 주요 보안에 대한 처리를 여러가지의 Filter로 처리하도록 
구성되어 있다.
    - 대표적으로 Authentication 인증 과 Authorization 인가에 대한 처리를 
Filter에서 수행한다.
    - 자동 설정 옵션을 사용하면 10개의 Spring Security Filter가 자동으로 
설정된다.

------------------

# FilterChain
![](https://velog.velcdn.com/images/minthug94_/post/3e79d4fb-03ce-4ecd-86bd-215795615f51/image.png)

이름 의미 그대로 여러개의 Filter들이 사슬처럼 연결되어 있고 서로 연결되어 
동작한다

- 클라이언트가 앱에 요청을 보내고 컨테이너는 요청 URI의 경로를 기반으로 
어떤 필터와 어떤 서블릿을 적용할지 결정한다
- 하나의 서블릿은 단일 요청을 처리하지만 필터는 체인을 형성해 순서를 
지정하며 실제로 요청 자체를 처리하려는 경우 필터가 나머지 체인을 거부 할 
수 있다.
- 필터는 다운스트림 필터와 서블릿을 사용해 요청과 응답을 수정할 수도 있다.
- 필터 체인의 순서는 매우 중요하며 Spring Boot은 두 가지 메커니즘을 통해 
이를 관리한다
- 하나의 Filter 타입의 @Beans에 @Order를 붙이거나 Orderd 를 구현하는 
것이고, 다른 하나는 API의 일부로 순서를 가지는 FilterRegistrationBean 의 
일부가 되는 것이다.
- 클라이언트는 애플리케이션으로 요청을 전송하고, 컨테이너는 Servlet 과 
여러 Filter로 구성된 FilterChain을 만들어 요청 URI path 기반으로 
HttpServletRequest를 처리한다
- Filter는 요청이 DispatcherServlet 에 의해 다뤄지기 전, 후에 동작한다
- Filter 는 FilterChain을 통해서 여러 필터가 연쇄적으로 동작하게 할 수 
있다.
- 1 개의 Servlet이 HttpServletRequest 와 HttpServletResponse 처리를 
담당한다
   -  Filter는 여러 개를 사용할 수 있다, 다운 스트림의 Servlet과 Filter의 
실행을 막는다
   이경우엔 Filter에서 HttpServletResponse를 작성한다
   - 다운스트림에 있는 Servlet과 여러 Filter로 HttpServletRequest나 
HttpServletResponse를 수정한다
- Filter는 FilterChain 안에 있을 때 효력을 발휘한다

## Filter Interface
```java
public void int(FilterConfig filterConfig) throws ServletException
// 필터를 웹 콘테이너 내에 생성한 후 초기화 할때 호출한다
'
public void doFilter(ServletReqeust request, ServletResponse response, 
FilterChain chain) throws java.io.IOException, ServletException
// 체인을 따라 다음에 존재하는 필터로 이동한다, 체인의 가장 마지막에는 
클라이언트가 요청한 최종 자원이 위치한다

public void destroy()
//필터가 웹 콘테이너에서 삭제될 때 호출한다

```

위 코드에서 필터의 역할을 하는 메서드는 바로 doFilter() 이다.
서블릿 컨테이너는 사용자가 특정한 자원을 요청했을 때, 그 자원 사이에 
필터가 존재할 경우 그 필터 객체의 doFilter() 메서드를 호출하여 바로 이 
시점부터 필터가 작용하기 시작한다

```java
public class FirstFilter implements Filter {
  
     public void init(FilterConfig filterConfig) throws ServletException {
        // 필터 초기화 작업
     }
     
     public void doFilter(ServletRequest request,
                          ServletResponse response,
                          FilterChain chain)
                          throws IOException, ServletException {
        // 1. request 파리미터를 이용하여 요청의 필터 작업 수행
        // 2. 체인의 다음 필터 처리
        chain.doFilter(request, response);        // 3. response를 
이용하여 응답의 필터링 작업 수행
     }
     
     public void destroy() {
        // 주로 필터가 사용한 자원을 반납
     }
  }
```
