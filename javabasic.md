🏃🏻
# 자바의 특징
* 운영체제에 독립적
  * 모든 운영체제(OS)에서 사용 가능하도록 호환성이 높게 만들어진 언어다
  <br>
* 객체 지향 언어 (Object Oriented Programming, OOP)
  * 자바는 객체지향 프로그래밍 개념을 사용하는 언어다. 따라서 모든 기능은 
객체로 만들어 사용해야 한다. 객체는 프로그램이 동작하는 부품으로 생각하면 
편하다. 여러 부품(객체)들을 만들고 조립해서 하나의 프로그램을 실행하는 
개념이 OOP다. 
  * 컴퓨터 == 완성된 하나의 프로그램
  * 램카드, 그래픽카드, cpu, SSD 등 부품들은 == 객체로 비유가 가능하다
  <br>
* 함수형 프로그래밍 지원
  
* 자동 메모리 관리 (Garbage Collection)
<br>

  *  자바는 개발자가 직접 메모리에 접근할 수 없도록 설계되어있으며, 
메모리는 자바가 직접 관리한다
  객체 생성 시 자동적으로 메모리 영역을 찾아 할당하고, 사용이 완료되면 
Garbage Colloector(AKA.쓰레기 수집기)를 실행시켜 자동적으로 사용하지 않는 
객체를 제거한다.
 
* 동적 로딩 (Dynamic Loading)지원
  * 자바 어플리케이션은 여러 개의 객체가 연결되 실행하는데, 이 객체들은 
클래스로부터 생성된다.
  앱이 실행될 때 모든 객체가 생성되지 않고, 객체가 필요한 시점에 클래스를 
동적 로딩해서 객체를 생성해낸다.
  개발이 완료된 후 유지보수가 발생하더라도 해당 클래스만 수정하면 되므로 
전체 앱을 다시 컴파일할 필요가 없으니, 유지보수가 쉽고 빠르게 진행할 수 
있다.
----

# JVM & JRE & JDK
> Write Once, Run Anywhere (한 번 쓰고 모든 곳에서 실행한다.)

## JVM 자바 가상머신(Java Virtual Machine)
자바는 컴파일러(Compiler)를 통해 기계어(Machine Language)로 변환되는 
언어다
컴파일(Compiler)이란, 특정 프로그래밍 언어를 기계가 이해할 수 있는 언어로 
옮기는 번역 과정이다.
자바 언어를 이해할 수 있는 코드 (바이트코드,ByteCode)로 변환하는 것을 
의미한다.

![](https://velog.velcdn.com/images/minthug94_/post/a17d5525-47d4-4b71-b423-fe8f93e2bd06/image.png)

JVM은 자바 프로그램을 실행시키는 도구입니다.

자바가 운영체제에 독립적인 것은 JVM이 있기 때문에 가능하다 
JVM은 자바 코드로 작성한 프로그램을 해석해 실행하는 별도의 프로그램이다. 
즉, 프로그램을 실행하는 프로그램이다.

![](https://velog.velcdn.com/images/minthug94_/post/051827c8-d405-4bff-a129-e790efbdabba/image.png)

## JRE (Java Runtime Environment)
자바 실행 환경의 약자, 자바 프로그램을 실행하기 위한 도구들이 들어있으며 
JVM이 이 안에 포함된다.
![](https://velog.velcdn.com/images/minthug94_/post/ce119291-48fe-4616-ba3d-b29e153655ac/image.png)


## JDK(Java Development Kit)
![](https://velog.velcdn.com/images/minthug94_/post/6080b7ec-1f41-4b3a-a822-57d285c9ab0d/image.png)

자바 개발 도구의 약자, 자바로 개발하기 위한 모든 것으 묶어놓은 키트이다
자바 실행 환경과 기타 개발 도구로 구성된다.

JRE(Java Runtime Environment) : JVM + 표준 클래스 라이브러리
JDK(Java Development Kit) : JRE + 개발에 필요한 도구



------
# 기본 타입과 참조 타입
**기본 타입 (primitive type)**
정수, 실수, 문자, 논리 리터럴을 저장하는 타입을 칭하며 원시 타입이라고도 
한다.
  * 데이터의 실제 값을 의미
  * 정수 타입 (byte, short, int, long), 실수 타입(float, double), 문자 
타입(char), 논리 타입(Boolean)

🚀 <span style="color:yellow">**실제 데이터 값을 저장**</span>하는 
타입이다.

**참조 타입(reference type)**
자바에선 실제 객체는 Heap 영역에 저장되며 참조 타입 변수는 스택 영역에 
실제 객체들의 주소를 저장하여 객체를 사용할 때 마다 참조 변수에 저장된 
주소를 불러와 사용하는 방식이다.

  * 데이터가 저장된 **주솟값**을 의미
  * 객체의 주소를 저장, 8개의 기본형을 제외한 나머지 타입
  ex) 문자열, 배열, 열거, 클래스, 인터페이스

이때 "**변수는 무엇무엇이다"** 라고 직접적으로 의미를 알려주면 기본 타입의 
데이터,
**"변수는 어디 페이지에 설명되었다"** 라고 하면 참조 타입의 데이터

## Stack
지역 변수, 파라미터, 리턴 값, 연산에 사용되는 임시 값들이 생성되는 영역
메소드를 호출할 때마다 스택 영역이 생성되고, 기본 타입 변수나 참조 타입 
변수가 쌓이고 사라지고를 반복한다.

ex) 기본 타입 변수
int a = 10; >> 정수 값이 할당되는 'a' 메모리 공간의 스택 영역이 생성 >> 
10이 할당

ex) class Person p = new Person(); >> 'p' 이름의 메모리 공간의 스택 영역  
생성 >> 생성된 p의 인스턴스는 Heap 영역에 생성

## Heap
new 키워드로 생성된 객체와 배열이 생성되는 영역, 메소드 영역에 로드된 
클래스만 생성이 가능하고 가비지 컬렉터가 참조되지 않는 메모리를 확인하고 
제거하는 영역이다

# 기본 타입 vs 참조 타입 차이
1. Null 포함 가능 여부
기본 타입은 null을 담을수 없지만, 참조 타입은 가능하다
2. 제네릭 타입에서 사용 가능 여부
위와 동일하게 기본 타입은 불가, 참조 타입은 가능
3.접근 속도, 메모리 양
기본 타입이 참조 타입에 비해 접근 속도가 훨씬 빠르고 메모리 양도 훨씬 적게 
사용한다.

## 정수 타입 (byte, short, int, long)
정수 타입은 byte, char, short, int, long 타입이 있다.
자바에선 정수 연산은 기본적으로 <code>int</code>로 한다.

![](https://velog.velcdn.com/images/minthug94_/post/4780b8f2-bb2f-444c-8f24-f7c12fd1962b/image.png)

### 롱타입 주의사항
```
int longnumber = 12345678910; // 오류 (정수 int의 범위를 벗어남)
```
<code>long</code>타입을 의미하는 <code>L</code>을 붙여주면 오류를 해결할 
수 있다.
이때 소문자 <code>l</code>을 입력해도 되지만 숫자와 혼동 가능성이 있으니 
대문자를 사용하자

```
int longnumber = 12345678910L;
```

### 오버/언더플로우
* 오버플로우
  * 자료형이 표현할 수 있는 범위 이상의 값을 표현할 경우 발생
  * 예) 한 값이 btye형일때, btye형의 최댓값인 127을 값으로 가지는 경우, 이 
값에 1 을 더하면 128이 아닌 -128이 된다.
  
* 언더플로우
  * 자료형이 표현할 수 있는 범위 이하의 값을 표현한 경우 발생
  * 예) 한 값이 btye형일때, btye 형의 최솟값인 -128 을 가지는 경우, 이 
값에 1을 빼면 -129가 아니라 127이 된다.
  
### 문자 타입(char)
char 타입의 변수는 **'단 하나의 문자'** 만 저장할 수 있다.
여러 문자를 저장하기 위해서는 문자열(String)을 사용해야 한다.

char 타입에는 문자를 직접 저장할 뿐 아니라, 10진수 16진수 정수도 저장이 
가능하다
다만 정수로 저장할 경우 출력 시 정수 값에 해당되는 유니코드 문자를 
출력한다

자바는 유니코드에 기반하여 문자를 표현한다,
**유니코드란? 전 세계의 모든 문자를 컴퓨터에서 일관되게 다루기 위한 국제 
표준
2byte 크기인 자바의 char(Character의 약자) 타입에 하나의 유니코드를 
저장한다
**

문자를 변수에 대입하면 문자 그대로 저장되는 것이 아닌, 그 문자에 해당하는 
정수 값(유니코드 값)이 저장된다.

```
char c1 = 'A' // char 타입은 작은 따옴표('')를 사용
System.out.println(c1); // 'A'가 출력

char c2 = 44032; // '가'의 유니코드값
System.out.println(c2); // '가'가 출력

char c3 = '\u0041';  // 16진수 정수 저장
char c4 = '65' // 10진수 정수 문자로 저장
```

## 실수 타입(float, double)
실수는 소수점을 가지는 값을 의미

<span style="color:yellow">자바에선 실수 연산은 기본적으로 double 타입으로 
처리</span>
- 정수 리터럴에 10의 지수를 나타내는 e 또는 E가 포함되어 있다면(부동 
소수점 방식), 실수 타입 변수에 저장해야한다.
```
float num1 = 3.14f;
double num2 = 3.141592d;
double num3 = 3.141592;
```
* float type: 4btye
* double type: 8btye

실수형 값 뒤에는 float형의 값인지, double형의 값인지 표현하기 위해 
<code>f</code> 또는<code>d</code>를 붙여야 한다
하지만, double형은 실수형의 디폴트(default) 값이기 때문에 <code>d</code>를 
붙이는건 num3 처럼 생략이 가능하다.

💡 double형은 float형보다 정밀도가 높다
더 큰 실수를 저장할 수 있고, 더 정확하게 저장이 가능하다

## 논리 타입(boolean)
논리 타입의 종류는 boolean형 한가지 뿐이다, boolean은 참 또는 거짓을 
저장할 수 있는 데이터 타입이며, 값으로는 <code>true</code> 와 
<code>false</code> 가 있다.

참과 거짓을 0과 1로 저장하므로 단 하나의 비트만으로 표현할 수 있는데, 
JVM이 다룰 수 있는 데이터의 최소 단위가 1byte이기 때문에 1byte의 크기를 
차지한다.

```
boolean isSunnyDays = true; // isSunnyDays 라는 변수를 선언하고 true의 
값을 대입한다.
if(isSunnyDays){
// 선크림을 들고 나간다
}
```

이때 조건은 햇빛이 쨍하거나, 쨍하지않거나 두가지
이렇게 조건을 참 or 거짓으로 표현 할수 있을때 boolean을 사용한다.



-----
## String 선언과 메서드
### String 클래스 선언
자바는 문자열을 String 변수에 저장하기 때문에 아래와 같이 String 변수를 
우선적으로 선언해야한다

기본적으로 String 타입은 큰따옴표("")로 감싸진 문자열 타입이며, char의 
배열을 의미한다

```
String str;

str = "문자열"; // 문자열 리터럴을 대입하는 방식

String str = "문자열"; // 선언과 동시에 저장도 가능

String str = new String("문자열"); // new 연산자를 사용해 객체를 생성하고 
문자열을 대입하는 방식
```

String type은 참조 자료형이다.
```
String name1 = "minthug";
String name2 = "minthug";
String name3 = new String("minthug");

//case1
System.out.println(name1 == name2); // true
System.out.println(name1 == name3); // false
```
위 예시의 경우 name1 과 name2는 동일한 문자열 리터럴로 생성된 객체를 
참조하기 때문에, 비교 연산자 (==)로 비교했을때, 결과값이 true가 나온다, 
하지만 name3는 new 키워드로 String 객체를 별도로 생성했기 때문에 주솟값이 
다르다

결과적으로 비교 연산자로 비교 하였을때, name1과 name3는 false의 값을 
나타낸다.

Stirng 메서드 예시
![](https://velog.velcdn.com/images/minthug94_/post/0b2f07f8-94bf-4841-b188-4cf1a5752308/image.png)


## StringTokenizer
StringTokenizer 클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 
클래스이다
그렇게 쪼개어진 문자열을 우리는 토큰(token)이라고 칭한다.
StringTokenizer를 사용하기 위해서는 java.util.StringTokenizer를 import 
해야 한다.

자주 사용하는 메서드
* int countTokens()
  - 남아있는 token의 개수를 반환한다. 전체 token의 갯수가 아닌 현재 
남아있는 token 갯수

* boolean hasMoreElements(), boolean hasMoreTokens()
  -다음의 token을 반환한다, StringTokenizer는 내부적으로 어떤 위치의 
토큰을 사용했는지 기억하고 있으며, 그 위치를 다음으로 옮긴다. -> 두가지 
메서드는 모두 같은 값을 반환
  
* Object nextElement(), String nextToken()
  - 이 두 메서드는 다음의 토큰을 반환한다, 두 가지 메서드는 같은 객체를 
반환하는데 반환형이 다르다 
-> nextElement는 Object를, nextToken은 String을 반환하고 있다.

## StringBuffer
### StringBuffer
String 클래스의 인스턴스는 한 번 생성되면 그 값을 읽기만 할 수 있고, 
변경할 수는 없다. 
하지만 StringBuffer 클래스의 인스턴스는 그 값을 변경할 수도 있고, 추가할 
수도 있게 된다. 
이를 위해 StringBuffer 클래스는 내부적으로 버퍼(buffer)라고 하는 독립적인 
공간을 가지는데, 버퍼 크기의 기본값은 16개의 문자를 저장할 수 있는 
크기이며, 생성자를 통해 그 크기를 별도로 설정할 수도 있다.
하지만 인스턴스 생성 시 사용자가 설정한 크기보다 언제나 16개의 문자를 더 
저장할 수 있도록 여유 있는 크기로 생성된다.

덧셈(+) 연산자를 이용해 String 인스턴스의 문자열을 결합하면, 내용이 합쳐진 
새로운 String 인스턴스를 생성한다. 
따라서 문자열을 많이 결합하면 결합할수록 공간이 낭비될 뿐만 아니라 속도 
또한 매우 느려지게 된다, 하지만 StringBuffer 인스턴스를 사용하면 문자열을 
바로 추가할 수 있으므로, 공간의 낭비도 없으며 속도도 매우 빨라지게된다. 

그렇다고 무조건 StringBuffer가 사용하는것이 좋냐?
상황에 따라 다를 것이다. StringBuffer 자료형은 String 자료형보다 무거운 
편에 속하낟.
<code>new StringBuffer();</code>로 객체를 생성하는 것은 일반 String을 
사용하는 것보다 메모리 사용량도 많고 속도도 느리다, 따라서 문자열 추가나 
변경 작업이 많은 경우에는 StringBuffer를 사용하고
문자열 변경이 거의 없으면 그냥 String을 사용하는것이 좋다
```
StringBuffer ts = new StringBuffer(); // 객체 ts 생성
ts.append("Hello");
ts.append(" ");
ts.append("java to study");
String result = ts.toString(); // toString()메소드를 이용하면 String 
자료형으로 변경할 수 있다.
System.out.println(result);
-> Hello java to study
```
버퍼를 사용하지않아도 충분히 가능하긴하다.
```
String result = "";
result += "Hello";
result += " ";
result += "java to study";
System.out.println(result);
-> Hello java to study 
```
StringBuffer에서 사용 가능한 메서드

#### append()메서드
append() 메서드는 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 
마지막에 추가한다.
이 메서드는 String 클래스의 concat() 메서드와 같은결과를 반환하지만, 
내부적인 처리 속도가 훨씬 빠르다.

```
StringBuffer str = new StringBuffer("Java");
System.out.println("문자열 : " + str);
System.out.println(str.append(" Study"));
System.out.println("append() 메서드 호출 후 문자열 : " + str);
```

#### capacity() 메서드
capacity() 메서드는 StringBuffer 인스턴스의 현재 버퍼 크기를 반환한다.

```
StringBuffer str01 = new StringBuffer();
StringBuffer str02 = new StringBuffer("Java");
System.out.println(str01.capacity()); // -> 16
System.out.println(str02.capacity()); // -> 20
```
예제처럼 길이가 4인 문자열로 StringBuffer 인스턴스를 생성하면, 기본적으로 
생성되는 여유 버퍼 크기인 16에 문자의 길이인 4를 더한 총 20개의 문자를 
저장할 수 있는 버퍼가 생성되는 것을 볼 수 있다.

#### delete() 메서드
delete() 메서드는 전달된 인덱스에 해당하는 부분 문자열을 해당 문자열에서 
제거한다.
또한, deleteCharAt() 메서드를 사용하면 특정 위치에 문자 한개만을 제거 
할수도 있다.

```
StringBuffer str = new StringBuffer("Java Oracle");
System.out.println("문자열 : " + str);
System.out.println(str.delete(4, 6)); // -> Javaracle
System.out.println(str.deleteCharAt(1)); // -> avaracle
System.out.println("deleteCharAt() 메소드 호출 후 문자열 : " + str); // -> 
avaracle
```
delete() 메서드를 사용하여 해당 문자열에서 인덱스가 4인 위치부터 6인 
위치의 문자까지를 삭제하고 있다.
이처럼 delete() 메서드는 첫 번째 매개변수로 전ㄷ라된 인덱스부터 두 번째 
매개변수로 전달된 인덱스 바로 앞의 문자를 삭제하는 메서드이다.

#### insert() 메서드
insert() 메서드는 인수로 전달된 값을 문자열로 변환한 후, 해당 문자열의 
지정된 인덱스 위치에 추가한다.
이때 전달된 인덱스가 해당 문자열의 길이와 같으면, append() 메서드와 같은 
결과를 반환한다.

```
StringBuffer str = new StringBuffer("Java Programming!!");
System.out.println("문자열 : " + str);
System.out.println(str.insert(4, "Script")); // -> "JavaScript 
Programming!!"
System.out.println("insert() 메서드 호출 후 문자열 : " + str);
```


----------
출처 관련 : https://itworldyo.tistory.com/14
https://week-year.tistory.com/141
https://wikidocs.net/276
