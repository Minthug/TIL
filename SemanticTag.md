Skip to content
Search or jump to…
Pull requests
Issues
Marketplace
Explore
 
@Minthug 
Minthug
/
Minthug.github.io
Public
Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights
Settings
Minthug.github.io/SemanticTag.md
@Minthug
Minthug Rename SemanticTag to SemanticTag.md
Latest commit e630b82 7 days ago
 History
 1 contributor
61 lines (40 sloc)  2.71 KB
   
## 시멘틱태그는?
Semantic '의미의','어의의','의미론적인'의 뜻을 가진 단어이다.
따라서 시맨틱 태그는 이 태그가 감싸고 있는 영역이 어떤 역할을 담당하는지 
개발자가 쉽게 파악할 수 있도록 도와준다.

div 태그의 기능과 마찬가지로 block element이면서 사이트의 구조(레이아웃)을 
설계하기 위한 태그.
HTML의 구조를 설계하는데 있어 태그에 의미를 부여 함으로써
사이트의 구조를 파악하기 용이할 수 있도록 도와주기 위해 만들어진 태그.

### 시멘틱태그의 장점

1. SEO 최적화의 유리
검색엔진은 태그를 기반으로 페이지 내에서 검색 키워드 위주로 우선 순위를 
탐색한다.

2. 웹 접근성에 효율적
일반적인 브라우저에서는 차이가 없지만 스크린리더(시각 장애인을 위한 웹 
서핑 프로그램)과 같은 환경에서는<br>
웹 접근성과 사용성을 향상시켜준다.

3. 유지보수의 용이성
많은 논시멘틱(Non-semantic) 태그의 사용으로 관리가 어려워지는 문제점에서 
벗어나, 태그의 이름만 보고도 어떤 영역인지 바로 확인이 가능하며
해당 태그 영역의 특성에 맞는 작업을 구분하여 진행하기에 용이하다.


-----------
![](https://velog.velcdn.com/images/minthug94_/post/bba23915-ceab-4afc-842b-0fed9c3abc72/image.png)

시멘틱태그의 종류
 

### header
머리글, 제목, 헤더, 로고 등을 나타냄

### nav 
네이게이션, 목차, 리스트 등 다른 페이지로의 이동을 위한 링크 공간을 위주로 
표현

### aside 
좌측과 우측 사이드 위치의 공간을 의미하며, 
본문 외에 부수적인 내용을 주로 표현하는 태그

### section 
구체적인 시멘틱 태그가 없는 문서의 독립적인 영역을 나타낸다.
주제, 카테고리 별로 섹션을 구분하는 용도의 태그로 주로 사용. 
같은 테마를 가진 여러개의 콘텐츠의 그룹화

### article 
기사, 블로그 등 텍스트 위주의 페이지를 구성할때 주로 사용. 

### footer 
바닥글, 문서 하단에 들어가는 정보 구분 공간을 표현하는 태그

### main 
이름처럼 문서 body의 중심 주제, 주요 내용 또는 응용 프로그램의 중심 기능과 
직접 관련되어나 확장되는 콘텐츠를 나타낸다.


--------

참고URL
https://velog.io/@syoung125/%EC%8B%9C%EB%A7%A8%ED%8B%B1-%ED%83%9C%EA%B7%B8-Semantic-Tag-%EC%9E%98-%EC%2%AC%EC%9A%A9%ED%95%98%EA%B8%B0#%EC%8B%9C%EB%A7%A8%ED%8B%B1-%ED%83%9C%EA%B7%B8-semantic-tag%EB%9E%80

https://webcooker.tistory.com/47

https://nonipc.com/entry/%EC%8B%9C%EB%A7%A8%ED%8B%B1-%ED%83%9C%EA%B7%B8-%EA%BC%AD-%EC%8D%A8%EC%95%BC-%ED%95%A0%EA%B9%8C
