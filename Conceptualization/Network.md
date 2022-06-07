# URL && URI

## URI
특정 리소스를 식별하는 통합 자원 식별자 (URI, Uniform Resource Identifier)
웹 기술에서 사용하는 논리적 또는 물리적 리소스를 식별하는 고유한 문자열 
시퀀스
URI에 존재는 인터넷에서 요구되는 기본조건으로서 인터넷 프로토콜에 항상 
붙어 다닌다.

## URL
URL,Uniform Resource Locator의 줄임말
흔히 웹 주소라고도 하며, 네트워크 상에서 웹 페이지, 이미지, 동영상 등의 
파일이 위차한 정보를 나타내고,
컴퓨터 네트워크 상에서 리소스가 어디 있는지 모두 나타낼수 있으며, 그 
주소로 접속하려면 해당 URL에 맞는 프로토콜을 알아야 하고 그와 동일한 
프로토콜에 접속해야 한다.
(URI의 서브셋)

![](https://velog.velcdn.com/images/minthug94_/post/e1e70152-0a15-4640-9feb-c6796a6cd580/image.png)

> URI는 식별하고, URL은 위치를 가르킨다.

"Minthug"는 내 이름이며 식별자(Identifier)이다. 
URI와 비슷하지만 내 위치나 연락처에 대한 정보가 없으며 URL은 될 수 없다.

"경기도 안산시 상록구 건건동"은 주소이며, 주소는 특정 위치를 가르킨다.
URL 및 URI와 비슷하면서 간접적으로 내가 있는 장소를 식별한다

|부분|명칭|설명|
|---|---|---|
|<code>file://</code>,<code>http://</code>,<code>https://</code>|scheme|통신 
프로토콜|
|127.0.0.1,www.google.com|hosts|웹 페이지, 이미지, 동영상 등의 파일이 
위치한 웹 서버, 도메인 또는 IP|
|:80,:443,:3000|port|웹 서버에 접속하기 위한 통로|
|/search,/Users/uesrname/Desktop|url-path|웹 서버의 루트 디렉토리로부터 웹 
페이지, 이미지, 동영상 등의 파일이 위치까지의 경로|
|q=Java|query|웹 서버에 전달하는 추가 질문|

> <code>127.0.0.1</code> 은 로컬 PC를 나타낸다

## URL와 URI의 구분 예시
- https://example.io 는 https://example.io 라는 서버를 나타내기 때문에 
URL이면서 URI이다.
- https://example.io/images 의 경우 example.io 서버의 images라는 네트워크 
상의 자원의 위치를 의미하기 때문에 URL이면서 URI이다.
- https://example.io/images/dog.jpeg 의 경운 example.io 서버의 images 
디렉터리 아래의 dog.jpeg 가리키므로 URL이며 URI이다
- https://example.io/user/123의 경운 URL은 https://example.io/user 
까지이며 원하는 정보에 도달하기 위한 식별자 123을 포함하면 URI이다. 즉, 
URI이지만 URL은 아니다.
- https://example.io/profile?id=1 의 경우도 마찬가지로 
https://example.io/profile 까진 URL이지만 원하는 정보에 도달하기 위한 
식별자(?id=1)를 포함하면 URI가 된다.
즉, URI이지만 URL은 아니다.

## IP와 포트

### IP (IP, Internet Protocol)
컴퓨터를 찾을 때 필요한 주소 (ex) 컴퓨터 주소, 집 주소)
- 컴퓨터 간의 네트워킹을 가능하게 하는 통신 규약
- 데이터 통신을 위해서 IP주소가 필요
- IP 주소는 컴퓨터가 네트워크에 연결될 때 정해진다.
- IPv4 : 10.210.32.40 과 같이 4개로 구분된 10진수의 숫자로 표시
- <code>0.0.0.0</code> , <code>255.255.255.255</code> : broadcast address, 
로컬 네트워크에 접속된 모든 장치와 소통하는 주소이다, 서버에서 접근 가능 
IP 주소를 broadcast address 로 지정하면, 모든 기기에서 서버에 접근할 수 
있다.

### 포트 (Port)
컴퓨터가 각종 신호, 정보 등을 주고 받을 수 있도록 해주는 통신 통로
- 여러 네트워크 활동을 할 때 사용하는 관문 같은 역할
- 컴퓨터 안에서 프로그램을 찾기 위한 수단. 즉, 각 프로세스가 위치한 방 
번호라고 생각하면 좋다
- 16비트로 된 숫자
- IP 번호 뒤에 콜론(:)으로 이어 붙임
- 포트 번호 구분
포트 번호는 0 ~ 65, 535까지 사용이 가능하다, 그중 0 ~ 1024번 까지의 포트 
번호는 주요 통신을 위한 규약에 따라 이미 정해져있다.
   - 잘 알려진 포트 (well-known port): 국제 도메인 관리 기구에서 통제
   ex) SSH:22 / HTTP:80 / HTTPS : 443
   잘 알려진 포트의 경우 URI 등에 명시하지 않지만 그외 잘 알려지지않은 
포트 (<code>:8080</code> 과 같은 임시포트)는 반드시 포함해야 한다.
   - 등록된 포트 (registered port): 국제 도메인 관리기구에 등록
   - 동적 포트 (dynamic port): 임시 포트들, 어떤 프로세스들에게 임의로 
사용 가능  
- IP + 포트 번호 -> 소켓

> IP 주소가 집 주소와 비슷한 개념이면, 포트 번호는 집 호수와 비슷한 개념
택배가 배달 되면, 보낸 사람은 집 주소를 알아서 보낼 수 있었지만 집 
호수(포트 번호)를 모르면 내게 정확히 전달 되지 않고 주소로만 도착한다.

## 도메인 && DNS

### Domain name
웹 브라우저를 통해 특정 사이트에 진입할 때, IP 주소 대신 사용하는 주소가 
있다
만약 IP주소를 지번 또는 도로명 주소 라고하면, 도메인 이름은 해당 주소의 
위치한 상호명 으로 볼 수 있다.

![](https://velog.velcdn.com/images/minthug94_/post/9056197f-2cd5-4b4f-983b-17ad55136878/image.png)

위 그림에서 IP주소는 <code>52.78.220.56</code> 이고, 도메인 이름은 
<code>velog.io</code>이다. 주소창에 
IP주소(<code>52.78.220.56</code>)입력하면, <code>velog.io</code>로 이동할 
수 있다.

### DNS (Domain Name Sysytem)
네트워크 상에서 존재하는 모든 PC는 IP 주소가 있다.
그러나 모든 IP 주소가 도메인 이름을 가지는 것은 아니다.

왜 사용하는가?
사용자가 길고 복잡한 IP 주소를 외울수가 없기 때문에 문자 주소를 사용하기 
위해 쓴다.

로컬 PC를 나타내는 <code>127.0.0.1</code> 은 <code>localhost</code> 로 
사용할 수 있지만, 그 외 모든 도메인 이름은 일정 기간 동안 대여해 사용한다
그러면 궁금하지않는가 어떻게 대여한 도메인 이름과 IP주소를 매칭하는지,
브라우저의 검색창에 도메인 이름을 입력하여 해당 사이트로 이동하기 위해선, 
해당 도메인 이름과 매칭된 IP 주소가 맞는지 확인하는 작업이 반드시 
필요하며, 네트워크에는 이것을 위한 서버가 별도로 존재한다

[작동원리](https://ja-gamma.tistory.com/entry/DNS%EA%B0%9C%EB%85%90%EB%8F%99%EC%9E%91%EC%9B%90%EB%A6%AC)

## 크롬 브라우저 에러 메세지 읽기
|메세지|내용|
|---|---|
|"Aw, Snap!|Chrome 브라우저에서 페이지를 로드하는데 문제가 발생했습니다|
|ERR_NAME_NOT_RESOLVED| 호스트 이름(웹 주소)이 존재하지 않습니다.|
|ERR_INTERNET_DISCONNECTED|사용 중인 기기가 인터넷에 연결되지 않았습니다|
|ERR_CONNECTION_RESET|웹페이지 연결을 방해하는 요소가 어딘가에 
발생했습니다.|

등 수없이 많은 문제가 있다 👉🏼 [크롬 에러 메시지 
목록](chrome://network-errors/)



----------
참고 URL
https://millo-l.github.io/URI%EC%99%80-URL%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90/
