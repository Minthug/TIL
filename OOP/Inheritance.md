# 상속🔥
상속이란?
기존의 클래스에 기능을 추가하거나 재정의해 새로운 클래스를 정의하는 것을 
말한다.

또한, 기존에 정의되어 있는 클래스의 모든 필드와 메소를 물려받아, 새로운 
클래스를 생성할 수 있다.
이때 기존에 정의되어 있던 클래스를 <code>부모 클래스 (parent class) 
</code> || <code> 상위 클래스 (super class)</code>||<code> 기초 클래스 
(base class) 라고도  한다</code>

이렇게 상속을 통해 만들어진 클래스를 <code> 자식 클래스 (child class) 
</code> || <code>하위 클래스 (sub class) </code> || <code> 파생 클래스 
(derived class) </code> 라고도 한다.

>⚑ 부모-자식 || 상위-하위 || 기초-파생 클래스

## 상속의 장점💡
상속의 장점은 무엇이냐?
* 기존에 작성된 클래스를 재활용 할 수 있다.
* 하위 클래스 설계 시 중복되는 멤버를 미리 상위 클래스에 작성해 놓으면, 
하위 클래스에선 해당 멤버를 작성하지 않아도 된다.
* 클래스 간의 계층적 관계를 구성함으로 다형성의 문법적 토대를 마련한다.

# 하위 클래스🔥
하위 클래스란? 
상위 클래스의 모든 특성을 물려받아 새롭게 작성된 클래스

```
class 하위클래스이름 extend 상위클래스이름 {...}
```

![](https://velog.velcdn.com/images/minthug94_/post/cb202c6d-b12f-495d-91d5-a51a9d112efe/image.png)

상위 클래스는 하위 클래스에 포함되는 것으로 볼 수 있다.
따라서 상위 클래스에 새로운 필드를 추가 하게되면, 하위 클래스에도 자동으로 
해당 필드가 추가된 것처럼 동작한다

하위 클래스에는 상위 클래스의 필드와 메소드만이 상속되며, 생성자와 초기화 
블록은 상속되지 않는다.
그리고 상위 클래스의 접근 제어가 _** private이나 default**_ 로 설정된 
멤버는 하위 클래스에서 상속은 받지만 접근은 할 수 없다.

```
class Person {
    public int Year = 2022;
    private int age = 24;
}

class Minthug extends Person {
    public int birthYear = 1994;

    void showAge(){
        System.out.println(birthYear); // 하위 클래스에서 선언한 public 
필드 참조
//        System.out.println(age);  // 상속받은 private 필드 참조
        System.out.println(Year); // 상속받은 public 필드 참조

    }
}
public class inheritance {
    public static void main(String[] args){
        Minthug mg = new Minthug();
        mg.showAge();

    }
}

-> 실행 결과는 
1994
2022 가 나온다.
```

하위 클래스에서 따로 선언하지 않은 필드라도 해당 이름의 필드를 상위 
클래스에서 상속받았다면 문제가 없다.

# Object 클래스 🔥
자바에선 Object 클래스는 모든 클래스의 상위 클래스가 되는 클래스이다
즉, 자바의 모든 클래스는 자동으로 Object 클래스의 모든 필드와 메소드를 
상속 받는다
그리고 자바의 모든 클래스는 별도로 extends 키워드를 사용하여 Object 
클래스의 상속을 명시하지 않아도 Object 클래스의 모든 멤버를 자유롭게 
사용할 수 있다.

## java.lang 패키지
java.lang 패키지란?
자바에서 가장 기본적인 동작을 수행하는 클래스들의 집합이다
자바에선 java.lang 패키지의 클래스들은 import문을 사용하지 않아도 클래스 
이름만으로 바로 사용할 수 있다.

## java.lang.Object 클래스
Object 클래스는 모든 자바 클래스의 최고 조상 클래스가 된다.
따라서 자바의 모든 클래스는 Object 클래스의 모든 메소드를 바로 사용할 수 
있다.

### toString() 
toString()은 해당 인스턴스에 대한 정보를 문자열로 반환한다.
이때 반환된 문자열은 클래스 이름과 함께 구분자로 '@'가 사용되며, 16진수 
해시 코드(hash code)가 추가된다

```
Minthug mg = new Minthug();

System.out.println(mg.toString());

-> Minthug@e580929
```
>⚑ 자바에서 toString() 은 기본적으로 각 API 클래스마다 자체적으로 
오버라이딩을 통해 재정의 되어있다.

### equals()
equals() 는 해당 인스턴스를 매개변수로 전달받는 참조 변수와 비교하여, 그 
결과를 반환한다.
이때 참조 변수가 가르키는 값을 비교하므로써, 서로 다른 두 객체는 언제나 
false를 반환한다.

```
Minthug mg = new Minthug();
Minthug mg2 = new Minthug();

	System.out.println(mg.equals(mg2));
    mg = mg2;
    System.out.println(mg.equals(mg2));

-> false
   true
```
>⚑ equals() 는 기본적으로 각 API 클래스마다 자체적으로 오버라이딩을 통해 
재정의 되어있다.

### clone()
clone() 은 해당 인스턴스를 복제하여, 새로운 인스턴스를 생성해 반환한다.
하지만 Object 클래스의 clone()은 단지 필드의 값만을 복사하여, 필드의 값이 
배열이나 인스턴스면 제대로 복제할 수 없다.
따라서 이러한 경우엔 해당 클래스에서 clone() 를 오버라이딩하여, 복제가 
제대로 이루어지도록 재정의 해야한다.

clone()는 데이터의 보호를 이유로 Cloneable 인터페이스를 구현한 클래스의 
인스턴스만 사용할 수 있다.

👉🏼[자세한내용](http://www.tcpschool.com/java/java_api_object)

## Object 메소드
![](https://velog.velcdn.com/images/minthug94_/post/3450fadc-e230-48d1-87db-ea1995acdce5/image.png)

