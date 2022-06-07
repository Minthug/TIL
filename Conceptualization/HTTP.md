![](https://velog.velcdn.com/images/minthug94_/post/a7b8f72a-72d8-450a-bf95-7007be260688/image.gif)

## HTTP
HyperText Transfer Protocol의 약자로, HTML과 같은 문서를 전송하기 위한 
Application Layer 프로토콜이다
HTTP는 웹브라우저와 웹 서버의 소통을 위해 디자인되었는데, 전통적인 
클라이언트- 서버 모델에서 클라이어튼가 HTTP messages 양식에 맞춰 요청을 
보내면, 서버도 HTTP messages 양식에 맞춰 응답한다

- HTTP의 특징은 무상태성이다 (Stateless)

### HTTP messages
메세지는 두 가지 타입을 가진다
요청은 클라이언트가 서버로 전달해서 서버의 액션이 일어나게끔 하는 
메시지고,
응답은 요청에 대한 서버의 답변이다.

HTTP messages는 클라이언트와 서버 사이에서 데이터가 교환되는 방식이다
- 요청(Requests)
- 응답(Responses)

HTTP messages는 몇 줄의 텍스트 정보로 구성된다
구성 파일, API, 기타 인터페이스에서 HTTP messages를 자동 완선한다

![](https://velog.velcdn.com/images/minthug94_/post/c43ed7ab-b241-43ad-9813-c4a1fc924977/image.png)

요청과 구조는 아래와 같은 유사한 구조를 가진다
1. Start line: start line에는 요청이나 응답의 상태를 나타내며 항상 첫 번째 
줄에 위치한다 -> 응답에선 status line이라 한다
2. HTTP headers: 요청을 지정하거나, 메시지에 포함된 본문을 설명하는 헤더의 
집합
3. empty line: 헤더와 본문을 구분하는 빈 줄이 있다.
4. body: 요청과 관련된 데이터나 응답과 관련된 데이터 또는 문서를 포함한다
요청과 응답의 유형에 따라 선택적으로 사용

> start line 과 HTTP headers를 묶어 요청이나 응답의 헤드라고 하고, 
payload는 body라 말한다



### 요청(Requests)
**Start line**
1. 수행할 작업 (GET, PUT, POST 등) 이나 방식 (HEAD or OPTIONS)을 설명하는 
HTTP method를 나타낸다 (ex. GET method는 리소스를 받아야하고, POST 
method는 데이터를 서버로 전송)
2. 요청 대상(일반적으로 URL or URI) 또는 프로토콜, 포트, 도메인의 절대 
경로는 요청 컨테스트에 작성된다 (요청 형식은 HTTP method에 따라 다름)
  -  origin gudtlr : ? 와 쿼리 문자열이 붙는 절대 경로
  POST. GET, HEAD, OPTIONS 등의 method를 함께 사용
  <code>POST / HTTP 1.1GET / background.png HTTP/1.0HEAD / 
test.html?query=alibaba HTTP/1.1OPTIONS/anypahe.html HTTP/1.0</code>
  - absolute 형식: 완전한 URL 형식으로, 프록시에 연결하는 경우 대부분 GET 
method와 함께 사용
  <code>GET http://developer.mozilla.org/en-US/docs/Web/HTTP/Messages 
HTTP/1.1</code>
  - authority 형식: 도메인 이름과 포트 번호로 이뤄진 URL의 authority 
component, HTTP 터널을 구축하는 경우, CONNECT와 함께 사용 가능
  <code>CONNECT developer.mozilla.org:80 HTTP/1.1</code>
  - asterisk 형식: OPTIONS 와 함께 별표(\*) 하나로 서버 전체를 표현한다.
  <code>OPTIONS * HTTP1.1</code>

3. HTTP 버전에 따라 HTTP message의 구조가 달라진다, 따라서 start line에 
HTTP 버전을 함께 입력

## Headers
Headers는 기본 구조를 따른다, 헤더 이름(대소문자 구분이 없는 문자열), 
콜론(:), 값을 입력한다 - 값은 헤더에 따라 다르다 (여러 종류 헤더가 존재)

- General headers: 메시지 전체에 적용되는 헤더로, body를 통해 전송되는 
데이터와는 관련이 없는 헤더
- Request headers: fetch를 통해 가져올 리소스나 클라이언트 자체에 대한 
자세한 정보를 포함하는 헤더를 말한다, User-Agent, Accept-Type, 
Accept-Language와 같은 헤더는 요청을 보다 구체화한다.
Referer처럼 컨텍스트를 제공하거나 if-None과 같이 조건에 따라 제약을 
추가할수 있다.
- Representation headers: 이전엔 Entity headers로 불렸으며, body에 담긴 
리소스의 정보 (콘텐츠 길이, MIME 타입 등)를 포함하는 헤더

![](https://velog.velcdn.com/images/minthug94_/post/a9bc36fc-b80b-4d7c-9be4-db5d3be30d94/image.png)

### Body
요청의 본문은 HTTP messages 구조의 마지막에 위치한다.
모든 요청에 body는 필요치 않다, GET, HEAD, DELETE, OPTIONS 처럼 서버에 
리소스를 요청하는 경우엔 본문이 필요치 않다.
POST or PUT과 같은 일부 요청은 데이터를 업데이트하기 위해 사용

- Single-resource bodies(단일-리소스 본문): 헤더 두 개(Content-Type && 
Content-Length)로 정의된 단일 파일로 구성
- Multiple-resource bodies(다중-리소스 본문): 여러 파트로 구성된 본문에선 
각 파트마다 다른 정보를 가진다.

|메서드|내용|
|---|---|
|GET|GET 메서드는 특정 리소스의 표시를 요청한다, GET을 사용하는 요청은 
오직 데이터를 받기만한다|
|HEAD|HEAD 메서드는 GET 메서드의 요청과 동일한 응답을 요구하지만,응답 
본문을 포함하지 않는다|
|POST|POST 메서드는 특정 리소스에 엔티티를 제출할 때 쓰인다, 이는 종종 
서버의 상태의 변화나 부작용을 일으킨다.|
|PUT|PUT 메서드는 목적 리소스 모든 현재 표시를 요청 payload로 바꾼다|
|DELETE|DELETE 메서드는 특정 리소스를 삭제한다
|CONNECT|CONNECT 메서드는 목적 리소스로 식별되는 서버로의 터널을 맺는다|
|OPTIONS|OPTIONS 메서드는 목적 리소스의 통신을 설정하는데 쓰인다|
|TRACE(en-US)|TRACE 메서드는 목적 리소스의 경로를 따라 메시지 loop-back 
테스트를 한다|
|PATCH|PATCH 메서드는 리소스의 부분만을 수정하는데 쓰인다.|


### 응답 (Responses)
응답의 첫 줄은 Status line이라 부른다

1. 현재 프로토콜의 버전(HTTP/1.1)
2. 상태 코드 - 요청의 결과를 나타낸다(200, 302, 404 등)
3. 상태 텍스트 - 상태 코드에 대한 설명

Status line 은 <code>HTTP/1.1 404 Not Found.</code> 처럼 생겼다

### Headers
응답에 들어가는 HTTP headers는 요청 헤더와 동일한 구조를 띈다.
대소문자 구분 없는 문자열과 콜론(:), 값을 입력 - 값은 헤더에 따라 다르다

- General headers: 메시지 전체에 적용되는 헤더로, body를 통해 전송되는 
데이터와는 관련이 없는 헤더
- Response headers: 위치 또는 서버 자체에 대한 정보(이름, 버전 등)와 같이 
응답에 대한 부가적인 정보를 갖는 헤더, Vary, Accept-Ranges와 같이 상태 
줄에 넣기엔 공간이 부족했던 추가 정보를 제공
- Representation headers: 이전엔 Entity headers 로 불렸으며, body에 담긴 
리소스의 정보(콘텐츠 길이, MIME 타입 등)를 포함한 헤더

![](https://velog.velcdn.com/images/minthug94_/post/387d41a5-0572-4178-b2bf-22094028d112/image.png)

### Body
응답의 본문은 HTTP messages 구조의 마지막에 위치
모든 응답에 body는 필요치 않다, 201, 204와 가은 상태 코드를 가지는 
응답에는 본문이 불필효하다.

- Single-resource bodies (단일-리소스 본문):
  - 길이가 알려진 단일 - 리소스 본문은 두 개의 헤더 (Content-Type, 
Content-Length)로 정의
  - 길이를 모르는 단일 파일로 구성된 단일 - 리소스 본문은 
Transfer-Encoding이 <code>chunked</code>로 설정되어 있으며, 파일은 chunk로 
나뉘어 인코딩되어 있다.
  
- Multiple-resource bodies(다중-리소스 본문): 서로 다른 정보를 담고 있는 
body

### Stateless
HTTP로 클라이언트오 서버가 통신을 주고받는 과정에서, HTTP가 클라이언트나 
서버의 상태를 확인하지 않는다, 
사용자는 웹페이지에 로그인하거나 상품을 클릭해 상세 화면으로 이동 -> 
상품을 카트에 담거나 로그아웃도 가능하다
클라이언트는 이런 모든 상태를 HTTP 통신이 추적하지 않는다, 페이지에서 
카트에 담기 버튼을 눌렀을 때, 카트에 담긴 상품 정보(상태)를 저장해둬야 
한다. 그러나 HTTP는 통신 규약일 뿐이니, 상태를 저장하지 않는다.
따라서, 필요에 따라 다른 방법을 통해 상태를 확인할 수 있다.

** Stateless(무상태성)이 HTTP의 큰 특징이다 **

[HTTP 상태 코드](https://developer.mozilla.org/ko/docs/Web/HTTP/Status)

