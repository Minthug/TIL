## 내부 클래스
하나의 클래스 내부에 선언된 또 다른 클래스를 말한다.
내부 클래스는 외부 클래스에 대해 두 개의 클래스가 서로 긴밀한 관계를 이룰 
때 선언할 수 있다.

## 내부 클래스 선언
```
class Outer {
	int iv = 0;  // 인스턴스 변수 
	static int cv = 0; // 클래스변수
    void setMethod() { 
    int lv = 0;  // 지역 변수
    }
}
```

```
class Outer {
	class InstanceInnerClass {}
    static class StaticInnerClass {}
    void setMethod() {
    	class LocalInnerClass {}
    }
}
```
두 코드를 비교하면 외부클래스에 서로 다른 3개의 클래스가 선언되어있다.
1번과 2번의 코드를 비교하면 내부 클래스의 선언 위치가 변수의 선언위치가 
동일한 것을 볼 수 있다.
변수가 선언된 위치에 따라 변수의 종류가 나뉘어지듯 내부 클래스도 선언된 
위치에 따라 종류가 나뉜다
_**각 내부 클래스의 선언 위치에 따라서 변수와 동일한 유효범위와 접근성을 
가지게된다.**_

## 내부 클래스의 장점
- 내부 클래스에서 외부 클래스의 멤버에 쉽게 접근이 가능하다
- 서로 관련 있는 클래스를 논리적으로 묶어서 표현하여, 코드의 캡슐화를 
증가시킨다.
- 외부에선 내부 클래스에 접근이 불가하며, 코드의 복잡성을 줄인다.

## 내부 클래스의 종류

### 인스턴스 내부 클래스 (Instance inner class)
선언되는 위치는 외부 클래스의 멤버변수 선언위치에 선언된다 👉🏼 멤버 내부 
클래스
사용 가능한 변수로는 외부 인스턴스 변수, 외부 전역 변수가 있다.


### 정적 클래스 (static class)
선언되는 위치는 외부 클래스의 멤버변수 선언위치에 선언된다 👉🏼 멤버 내부 
클래스
사용 가능한 변수로는 외부 전역 변수가 있다.

### 지역 내부 클래스 (Local inner class)
선언되는 위치는 외부 클래스의 메서드나 초기화블럭 안에서 선언된다
사용 가능한 변수로는 외부 인스턴스 변수, 외부 전역 변수가 있다.

### 익명 내부 클래스 (Anonymous inner class)
선언되는 위치는 클래스의 선언과 객체의 생성을 동시에 하는 일회용으로 
쓰이는 익명 클래스이다.
사용 가능한 변수로는 외부 인스턴스 변수, 외부 전역 변수가 있다.
>⚑ 단 한번만 사용이 가능하고 오직 하나의 객체만 생성하는 일회용이다.
이름이 없기에 생성자도 없으며, 상위클래스의 이름이나 구현하고자하는 
인터페이스의 이름을 사용하여 정의하기 때문에 하나의 클래스르 상속받는 
동시에 인터페이스를 구현하거나 둘 이상의 인터페이스를 구현할 수 없다.
그러므로 오직 단 하나의 클래스를 상속받거나, 단 하나의 인터페이스만 
구현해야한다.


## 내부 클래스의 제어자와 접근성
내부 클래스도 클래스이기 때문에 <code>abstract</code>나 <code>final</code> 
과 같은 제어자를 사용할 수 있을뿐만 아니라, 멤버 변수들처럼 
<code>private</code>이나 <code>protected</code>과 접근제어자도 사용이 
가능하다.

예제를 많이 살펴보자
```
public class InnerClassExam {
	class InstanceInner {
    
    }
	static class StaticInner {
    
    }
    
    // 인스턴스 멤버 간 서로 직접적으로 접근 가능
    InstanceInner iv = new InstanceInner();
    
    // static 멤버 간엔 서로 직접 접근 가능
    static StaticInner cv = new StaticInner();
    
    static void staticMethod() {
    
    // static 멤버는 인스턴스멤버에 직접적으로 접근 불가
  //InstanceInner objA = new InstanceInner(); 
    StaticInner objB = new StaticInner();
    
    // 만약 접근을 원한다면 객체를 먼저 생성해야한다.
    // 인스턴스클래스는 외부 클래스를 먼저 생성해야 생성이 가능하다
    InnerClassExam outer = new InnerClassExam();
    InstanceInner obj = outer.new InstanceInner();
	}
    
    void setMethod() {
    	class LocalInner {
        
       
    }
	LocalInner lv = new LocalInner();
	}
}
```


