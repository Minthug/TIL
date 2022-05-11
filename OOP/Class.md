# Class🔥
자바에서 클래스란?
객체를 정의하는 틀 또는 설계도와 같은 의미로 사용된다.
자바에선 이러한 설계도인 클래스를 가지고, 여러 객체를 생성하여 사용하게 
된다.

클래스는 객체의 상태를 나타내는 <code>필드(field)</code>와 객체의 행동을 
나타내는 <code>메소드(method)</code>로 구성된다.

즉, 필드란 클래스에 포함된 변수를 의미한다.
메소드란 어떠한 특정 작업을 수행하기 위한 <span 
style="color:yellow">명령문의 집합</span> 이라 할수 있다.

### 클래스 구성요소
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
## 클래스의 선언
클래스란 객체 지향 프로그래밍의 추상화라는 개념을 직접 구현한 것이라 
할수있는데,
자바에선 개발자의 편의를 위해 유용하게 사용할 수 있는 많은 수의 클래스를 
미리 정의하여 제공하고있다.
또한, 개발자가 원하는 동작을 하는 새로운 클래스를 손쉽게 작성할 수도 있다.

>정의
>>접근제어자 class 클래스이름 {
접근제어자 필드1의타입 필드1의이름;
접근제어자 필드2의타입 필드2의이름;
...
접근제어자 메소드1의 원형
접근제어자 메소드2의 원형
...
};


<center><img src = 
https://velog.velcdn.com/images/minthug94_/post/150a611b-287b-4b68-a0b4-4f5d42698ee7/image.png 
width="70%" height="50%"></center>


## 인스턴스🔥
자바에서 클래스를 사용하기 위해선 우선 해당 클래스 타입의 객체를 
선언해야한다.
이렇게 클래스로부터 객체를 선언하는 과정을 "인스턴스 화"라고 한다.
또한, 이렇게 선언된 해당 클래스 타입의 객체를 "인스턴스" 라고 한다.
인스턴스란? 메모리에 할당된 객체를 말한다.

자바에선 하나의 클래스로부터 여러 개의 인스턴스를 생성할 수 있다.
이렇게 생성된 인스턴스는 독립된 메모리 공간에서 저장된 자신만의 필드를 
가질수 있다.
하지만 해당 클래스의 모든 메소드는 해당 클래에서 생성된 모든 인스턴스가 
공유하게 된다.

![](https://velog.velcdn.com/images/minthug94_/post/d3a96115-1363-47ac-a85f-c3ad31f031f7/image.png)

### 인스턴스 생성

> 선언 >  클래스이름 객체참조변수이름;
>> 예) Vehicle myVehicle

이 후 new키워들 사용해 인스턴스를 생성하고, 해당 인스턴스의 주소를 미리 
선언한 참조 변수에 저장하여 사용한다.
> 선언 > 객체참조변수이름 = new 클래스이름();
>> myVehicle = new Vehicle();

동시에도 가능하다
> 선언 > 클래스이름 객체참조변수이름 = new 클래스이름();
>> Vehicle myVehicle = new Vehicle();


## 필드(field)🔥
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

클래스 변수와 인스턴스 변수는 초기화를 하지 않아도 변수의 타입에 맞게 
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


## 객체란?🔥
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



