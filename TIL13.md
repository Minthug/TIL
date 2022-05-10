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


# Class
자바에서 클래스란?
객체를 정의하는 틀 또는 설계도와 같은 의미로 사용된다.
자바에선 이러한 설계도인 클래스를 가지고, 여러 객체를 생성하여 사용하게 
된다.

클래스는 객체의 상태를 나타내는 <code>필드(field)</code>와 객체의 행동을 
나타내는 <code>메소드(method)</code>로 구성된다.

즉, 필드란 클래스에 포함된 변수를 의미한다.
메소드란 어떠한 특정 작업을 수행하기 위한 <span 
style="color:yellow">명령문의 집합</span> 이라 할수 있다.

## 클래스 구성요소
* 필드
* 메소드
* 생성자
* 이너클래스

```
class Car {                    // 클래스 이름

    private String modelName;  // 필드

    private int modelYear;     // 필드

 
 Car(String modelName, int modelYear) { // 생성자

        this.modelName = modelName;

        this.modelYear = modelYear;

    }

 public String getModel() { // 메소드

    return this.modelYear + "년식 " + this.modelName + " " + this.color;

    }

}
```
## 필드(field)
클래스의 필드란 클래스에 포함된 변수를 의미한다
클래스 내에서 필드는 선언된 위치에 따라 구분된다.

1. 클래스 변수
2. 인스턴스 변수
3. 지역 변수

```
class Car {

    static int modelOutput; // 클래스 변수
    String modelName;       // 인스턴스 변수

 

    void method() {
        int something = 10; // 지역 변수
```

클래스 변수와 인스턴스 변수는 초기화를 하지 않아도 변수의 타입에 맞ㄷ게 
자동으로 초기화된다.
지역 변수는 사용하기 전 초기화하지 않으면, 자바 컴파일러 오류를 
발생시킨다.

### 클래스 변수와 인스턴스 변수
클래스 영역에 위치한 변수 중에서 static 키워드를 가지는 변수를 클래스 
변수(static variable)라고 한다. 그리고 클래스 영역에 위치한 변수 중 static 
키워드를 가지지않는 변수는 인스턴스 변수(instance variable)라고 한다.

또한, 메소드나 생성자, 초기화 블록 내에서 위치한 변수를 지역 변수 (local 
variable)이라 한다.
선언된 위치에 따라 구분되는 변수는 생성 및 소멸 시기, 저장되는 메모리 
공간과 사용법 모두 다르다.
![](https://velog.velcdn.com/images/minthug94_/post/a50a4cf7-cdb8-49fd-82de-e3bf17677b6d/image.png)
클래스 변수는 인스턴스를 생성하지 않고도 바로 사용이 가능하다
이러한 클래스 변수를 <code>공유 변수 (shared variable)</code>라 한다.

이런 클래스 변수는 해당 클래스의 모든 인스턴스가 공유해야 하는 값을 
유지하기 위해 사용된다.
반면에 인스턴스 변수는 인스턴스마다 가져야 하는 고유한 값을 유지하기 위해 
사용된다.

```
class Field {
    static int classVar = 10; // 클래스 변수 선언
    int instanceVar = 20;     // 인스턴스 변수 선언
}
public class Member01 {
    public static void main(String[] args) {

        int var = 30;                   // 지역 변수 선언
        System.out.println(var + "\n"); // 지역 변수 참조

        Field myField1 = new Field();   // 인스턴스 생성
        Field myField2 = new Field();   // 인스턴스 생성

        System.out.println(Field.classVar); // 클래스 변수 참조
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n");

        myField1.classVar = 100;            // 클래스 변수의 값을 변경

        System.out.println(Field.classVar); // 클래스 변수 참조
        System.out.println(myField1.classVar);
        System.out.println(myField2.classVar + "\n");

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조
        System.out.println(myField2.instanceVar + "\n");

        myField1.instanceVar = 200;               // 인스턴스 변수의 값을 
변경

        System.out.println(myField1.instanceVar); // 인스턴스 변수 참조
        System.out.println(myField2.instanceVar);
    }
```

🚀[자세한 내용](http://www.tcpschool.com/java/java_member_field)

## 메소드
클래스에서 메소드란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 
수 있다.
즉, 메소드를 사용하면 중복되는 코드의 반복적인 프로그래밍을 피할 수 있게 
된다.
또한, 모듈화로 인해 전체적인 코드의 가독성이 좋아진다.
프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수를 
할 수 있다.

```
접근제어자 반환타입 메소드이름(매개변수 목록) { // 선언부
//구현부
}
```
1. 접근 제어자
해당 메소드에 접근할 수 있는 범위를 명시한다.

2. 반환 타입 (return type)
메소드가 모든 작업을 마치고 반환하는 데이터 타입을 명시한다.

3. 메소드 이름
메소드를 호출하기 위한 이름을 명시한다.

4. 매개변수 목록 (parameters)
메소드 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시한다.

5. 구현부
메소드의 고유 기능을 수행하는 명령문의 집합

```
class vehicle {
	private int currentSpeed;
    private int accelerationTime;
 ...
 
 public void accelrate(int speed, int sec) { // 선언부
 // 구현부
 	System.out.println(sec +" 간 속도를 시속 " + speed + " 로 가속한다 
" );
 }
```

🔥 메소드 시그니처 (method signature)
메소드 선언부에 명시되는 매개변수의 리스트를 가리킨다.
만약 두 메소드가 매개변수의 개수와 타입, 그 순서까지 모두 같다면, 이 두 
메소드의 시그니처는 같다고 할 수 있다.


### 메소드 호출
자바에선 정의한 메소드는 멤버 참조 연산자 (.)를 사용하여 호출할 수 있다.

```
1.객체참조변수이름.메소드이름(); // 매개변수가 없는 메소드 호출
2.객체참조벼수이름.메소드이름(pra1, pra2, ...); // 매개변수가 있는 메소드 
호출
```


## 생성자(constrctor)
자바에선 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 
있는 생성자라는 메소드를 제공한다.
자바에서 생성자의 이름은 해당 클래스의 이름과 같아야한다.
즉, Car클래스의 생성자의 이름은 Car가 된다.

### 생성자의 특징
* 생성자는 반환값이 없지만, 반환 타입을 void형으로 선언하지 않는다.
* 생성자는 초기화를 위한 데이터를 인수로 전달 받을 수 있다.
* 객체를 초기화하는 방법이 여러 개 존재할 경우에는 하나의 클래스가 여러 
개의 생성자를 가질 수 있다.
-> 생성자도 하나의 메소드이므로, 메소드 오버로딩(overLoading)이 가능하다.

```
Car(String modelName){}
Car(String modelName, int modelYear){}
Car(String modelName, int modelYear, String modelColor){}
Car(String modelName, int modelYear, String modleColor, int maxSpeeds){}
```

### 생성자의 선언
```
1. 클래스이름(){...} // 매개변수가 없는 생성자 선언
2. 클래스이름(pra1, pra2, ...) {...} // 매개변수가 있는 생성자 선언
-> 매개변수를 전달받아 인스턴스 변수를 초기화하는 생성자도 선언이 
가능하다.
```

```
Car(String modelName, int modelYear, String modleColor, int maxSpeeds){
	this.modelName = modelNamel;
    this.modelYear = modelYear;
    this.modelColor = modelColor;
    this.maxSpeeds = maxSpeeds;
    this.currentSpeed = 0;
 ⚠️ 예제처럼 클래스의 생성자는 어떠한 반환값도 명시하지 않음에 
주의해야한다.
```

### 생성자 호출
자바에선 <code>new</code> 키워드를 사용하여 객체를 생성할 때 자동으로 
생성자가 호출됩니다.
```
class Car {
	private String modelName;
    private int modelYear;
    private String modelColor;
    private int maxSpeed;
    private int currentSpeed;

Car(String modelName, int modelYear, String modleColor, int maxSpeeds){
	this.modelName = modelName;
    this.modelYear = modelYear;
    this.modelColor = modelColor;
    this.maxSpeed = maxSpeed;
    this.currentSpeed = 0;
    
 public String getModel() {
 	return this.modelYear + "년식" + this.modelName + "" + 
this.modelColor;
   }
 }
 
 public class example {
 	public static void main(String[] args) {
  		Car mycar = new Car("benz",2022,"white",230); // 생성자 
호출
        System.out.println(mycar.getModel()); // 생성자에 의해 
초기화되었는지 확인함.
    }
 }
```

## 기본 생성자 (default constructor)
자바의 모든 클래스에는 하나 이상의 생성자가 정의되어야 한다.
하지만 특별히 생성자를 정의하지 않아도 인스턴스를 생성할 수 있다.
자바 컴파일러가 기본 생성자라는 것을 기본적으로 제공해주기 때문이다, 기본 
생성자는 매개변수를 가지지 않으며 아무런 명령어도 포함하지않고 있다.

> 클래스이름(){}

> Car(){}

이렇게 기본 생성자는 어떠한 매개변수도 전달 받지 않으며, 기본적으로 아무런 
동작도 하지않는다.

```
class Car {

    private String modelName = "BMW";
    private int modelYear = 2016;
    private String modelColor = "파란색";

    public String getModel() {
        return this.modelYear + "년식 " + this.modelColor + " " + 
this.modelName;
    }
}

 

public class example02 {
    public static void main(String[] args) {

        Car myCar = new Car();                // 기본 생성자의 호출
        System.out.println(myCar.getModel()); // 2016년식 파란색 BMW
    }
}
```
예시처럼 Car 클래스의 인스터스인 myCar는 기본 생성자를 사용하여 생성된다.
하지만 기본 생성자는 아무런 동작도 하지 않으므로, 인스턴스 변수를 클래스 
필드에서 바로 초기화 하고있다.
이처럼 인ㅅ흐턴스 변수의 초기화는 생성자를 사용하여 수행할 수 있지만, 
클래스 필드에서 바로 수행 할수있다.

만약 매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 
자동으로 추가되지 않는다.
따라서 매개변수르 가지는 생성자를 하나 이상 정의한 후 기본 생성자를 
호출하면 오류가 발생할 것이다.

🚀[자세한내용](http://www.tcpschool.com/java/java_methodConstructor_constructor)
## 객체란?
```
class Food{
}
// -> 클래스의 선언만 있고 내용이 없는 껍데기뿐인 클래스인 상태

public class example {
public static void main(String[] args) {
	
    
    }
}

```
하지만 이렇게 껍데이기뿐인 클래스도 아주 중요한 기능을 가지고 있다.
바로 그 기능은 object(객체)를 만드는 기능이다.

```
//객체 만드는 과정

class Food{
}

public class example {
public static void main(String[] args) {
	Food pizza = new Food();
    
    }
}
```
<code>new</code>는 객체를 생성할 때 사용하는 키워드이다.
이렇게 하면 Food 클래스의 인스턴스(instance)인 pizza, 즉 Food의 객체가 
만들어진다.

⚠️ 객체와 인스턴스
클래스에 의해 만들어진 객체를 인스턴스라고 한다.

<code>Food pizza = new Food();</code> 이렇게 만들어진 pizza는 객체이다.
그리고 pizza라는 객체는 Food의 인스턴스(instance)이다.
인스턴스라는 말은 특정 객체(pizza)가 어떤 클래스(Food)의 객체인지를 관계 
위주로 설명할 때 사용된다.
예로 "pizza는 인스턴스" 보단 <span style="color: yellow">**pizza는 
객체"라는 표현**</span>이 "pizza는 Food의 객체" 보다는 <span style="color: 
yellow">**"pizza는 Food의 인스턴스"라는 표현**</span>이 더 어울린다

> 다른 예시

<center><img src 
=https://velog.velcdn.com/images/minthug94_/post/685ce3f7-97eb-4d0e-86e3-dd03f07e13c8/image.jpeg 
width ="70%" heigth ="50%"></center>

* 쿠키틀 -> 클래스(class)
* 쿠키틀에 의해 만들어진 쿠키들 -> 객체(object)

```
Food pizza = new Food();
Food rice = new Food();
Food noodle = new Food();
```
와 같이 무수히 많은 음식 객체들을 Food 클래스로 만들 수 있다.




---
출처: https://jeong-pro.tistory.com/95 [기본기를 쌓는 정아마추어 
코딩블로그]

http://www.tcpschool.com/java/java_polymorphism_concept

https://chanhuiseok.github.io/posts/java-1/
