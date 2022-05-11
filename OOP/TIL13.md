### 객체 지향 프로그래밍(Object-Oriented Programming, OOP)
객체 지향 프로그래밍은 <span style="color: yellow">컴퓨터 프로그램을 
명령어의 목록으로 보는 시각에서 벗어나 여러 개의 독립된 단위인 객체들의 
모임으로 파악하고자 하는 것</span> 이다.

프로그래밍에서 필요한 데이터를 추상화시켜 상태와 행위를 가진 객체를 만들고 
그 객체들 간의 유기적인 상호작용(메세지를 주고 받고, 데이터를 처리하고)을 
통해 로직을 구성하는 프로그래밍 방법이다.

> 체스 게임을 만든다고 예를 들어보자
체스는 기본적으로 체스판 과 체스말이 필요하다.
여기서 객체 지향 프로그래밍은 체스판 과 체스말을 객체화시켜
* 체스판 && 체스말
두 가지를 객체로 만들수 있다.
그리고 두 각각의 객체는(체스판과 체스말)은 서로 데이터를 주고 받을 수 
있다.

# 특징
* 자료 추상화
* 상속
* 다중 상속
* 다형성
* 동적 바인딩

## 자료 추상화
자료 추상화란? 
불필요한 정보를 숨기고 중요한 정보만을 표현함으로써 프로그램을 간단하게 
만드는 것이다. 또한 자료 추상화를 통해 정의된 자료형을 추상 자료형이라고 
한다.

추상 차료형은 자료형의 자료 표현과 자료형의 연산을 캡슐화 한것으로
접근 제어를 통해서 자료형의 정보를 은닉할 수 있다.

객체 지향 프로그래밍에선 일반적으로 추상 자료형을 <code>클래스</code>, 
추상 자료형의 인스턴스를 <code>객체</code>, 추상 자료형에서 정의된 연산을 
<code>메소드(함수)</code>, 메소드의 호출을 <code>생성자</code>라고 한다.
>예를 들어, 전기 밥솥을 추상적 자료형에 비유한다면, 그 속에 들어가는 밥은 
자료가 되고, 밥솥에 있는 취사, 예약취사 버튼들과 남은 시간을 표시하는 
디스플레이에 어떤 내용들이 표시되어야 하는지를 명기한 것이다. <br>
추상적 자료형에서는 이것들이 어떻게 구성되는지 관심이 없고, 몇 와트의 
전기를 소모하는지에 대해서도 관심이 없다.

## 상속
상속은 새로운 클래스가 기존의 클래스의 자료와 연산을 이용할 수 있게 하는 
기능이다.
상속을 받는 새로운 클래스를 <code>부클래스</code>, <code>파생 
클래스</code>, <code>하위 클래스</code>, <code>자식 클래스</code>라고 하며 
새로운 클래스가 상속하는 기존의 클래스를 <code>기반 클래스</code>, 
<code>상위 클래스</code>, <code>부모 클래스</code>라고 한다.

상속을 통해서 기존의 클래스를 상속받은 하위 클래스를 이용해 프로그램의 
요구에 맞추어 클래스를 수정할 수 있고, 클래스 간의 종속 관계를 
형성함으로써 객체를 조직화 시킬 수 있다.

```
public Class Parent{ .... }; // 부모 클래스
public Class Child extends parent { .... }; // 자식 클래스

```

```
public class ParentMagazine{
  String name; //필드
  int price;

public void Print(){ // 메소드
  System.out.println("잡지의 이름과 가격 : "+name+" "+price);
}
```
```
public class ChildBook extends ParentMegazine{
  ChildBook (String name, int price){ // 생성자
    this.name = name;  //  ChildBook이 ParetBook의 필드를 상속받아서 
가능한 선언
    this.price = price; //  "
}

public static void main (String[] args){
  ChildBook Child = new ChildBook("나의 라임오렌지 나무", 10000);
  System.out.print("[구현 결과 1] ");
  Child.Print();
}
```

## 다중상속
다중상속은 클래스가 2개 이상의 클래스로부터 상속받을 수 있게 하는 
기능이다.
클래스들의 기능이 동시에 필요할 때 용이하나 클래스의 상속 관계에 혼란을 줄 
수 있고, 프로그래밍 언어에 따라 사용 유뮤가 다르므로 주의해서 
사용해야한다.
JAVA에서는 지원하지않는다.

## 다형성
다형성 개념이란 어떤 한 요소에 여러 개념을 넣어 놓는 것으로 일반적으로 
오버라이딩(OverRiding, 같은 이름의 메소드가 여러 클래스에서 다른 기능을 
하는 것)이나 오버로딩 (OverLoading, 같은 이름의 메소드가 인자의 개수나 
자료형에 따라 다른 기능을 하는것)을 의미한다.

[다형 개념](http://www.tcpschool.com/java/java_polymorphism_concept)을 
통해서 프로그램 안의 객체 간의 관계를 조직적으로 나타낼 수 있다.
```
class Parent { ... }

class Child extends Parent { ... }

...

Parent pa = new Parent(); // 허용

Child ch = new Child();   // 허용

Parent pc = new Child();  // 허용

Child cp = new Parent();  // 오류 발생.
```

## 동적 바인딩
동적 바인딩은 실행 시간 중에 일어나거나 실행 과정에서 변경될 수 있는 
바인딩으로 컴파일 시간에 완료되어 변화하지 않는 정적 바인딩과 대비되는 
개념이다.
동적 바인딩은 프로그램의 한 개체나 기호를 실행 과정에 여러 속성이나 연산에 
바인딩함으로써 다형 개념을 실현한다.

![](https://velog.velcdn.com/images/minthug94_/post/bd21d182-bd6e-4689-bf5c-eda63851f23f/image.png)



# 장점
* 재사용성
상속을 통해 프로그래밍시 코드의 재사용을 높일 수 있다.

* 생산성 향상
잘 설계된 클래스를 만들어서 독립적인 객체를 사용함으로 개발의 생산성을 
향상 시킬수 있다.

* 자연적인 모델링
우리의 일상생활의 구조가 객체에 자연스럽게 녹아들어 있기 때문에 생각하는 
것을 그대로 자연스럽게 구현할 수 있다.

* 유지보수의 우수성
프로그램 수정시 추가, 수정을 해도 캡슐화를 통해 주변 영향이 적기 때문에
유지보수가 쉬워서 매우 경제적이다.


---
출처: https://jeong-pro.tistory.com/95 [기본기를 쌓는 정아마추어 
코딩블로그]

http://www.tcpschool.com/java/java_polymorphism_concept

https://chanhuiseok.github.io/posts/java-1/
