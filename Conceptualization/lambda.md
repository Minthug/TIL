최근 진도를 나가는데 람다에 대한 이해가 너무 부족해 개념부터 잘 
정립해보고자 글을 쓴다.

---
# 람다식
람다식은 함수를 좀 더 간단하고 편리하게 표현하기 위해 고안된 문법 
요소이다.

```java
// 기존 메서드 표현 방식
void sayhello() {
System.out.println("HELLO!");
}

//람다식으로 표현한 식
() -> System.out.println("HELLO!");
```

한눈에 봐도 굉장히 간편해보이는 점이 있다.
람다식은 기본적으로 반환타입과 이름을 생략할 수 있다, 따라서 람다함수를 
종종 익명 함수(anonymous function)이라 부른다

```java
int sum(int num1, int num2) {
	return num1 + num2;
}

// 람다식 -> 반환타입과 메서드명 제거 + 화살표 추가
(int num1, int num2) -> { 
	return num1 + num2;
}

// 반환값이 있는 메서드는 return문과 세미콜론(;) 생략 가능
(int num1, int num2) -> {
	num1 + num2
}
```

```java
void example1() {
	System.out.println(5);
}

// 람다식
() -> { System.out.println(5); }
```

```java
int example2() {
	return 10;
}

//람다식
() -> { return 10; }
```

```java
void example3(String str) {
System.out.println(str);
}

//람다식

(String str) -> { System.out.println(str); }
```

여기서 특정 조건이 충족되면 람다식을 더욱 축약해서 표현이 가능하다

```java
int sum (int num1, int num2) {
      return num1 + num2;
}

//람다식
(int num1, int num2) -> { num1 + num2 } 
    
```
sum 메서드는 위에 언급한 '특정 조건'에 충족하는 메서드이기 때문에 더 
축약해보자
메서드 바디에 실행문이 하나만 존재할 때 중괄호를 생략이 가능하다
```java
(int num1, int num2) -> num1 + num2 
```

반대로 실행문이 2개 이상인 경우엔 중괄호가 생략이 불가능할것이다

두번째로, 매개변수 타입을 쉽게 유추할 수 있는 경우엔 매개변수의 타입을 
생략할 수 있다.
```java
(num1, num2) -> num1 + num2 == int sum(int num1, int num2) { return num1 + 
num2; }
```

놀랍게도 동일한 기능을하는 표현식이다.

---
# 람다의 장단점

### 장점
- 코드의 간결성: 람다를 사용하면 불필요한 반복문의 삭제가 가능하며 복잡한 
식을 단순하게 표현 가능하다
- 지연연산 수행: 람다는 지연연상을 수행 함으로써 불필요한 연산을 최소화 
시킨다.
- 병렬처리 가능: 멀티쓰레드를 활용해 병렬처리를 사용할 수 있다.

### 단점
- 람다식의 호출이 까다롭다
- 람다 stream 사용 시 단순 for문 혹은 while문 사용 시 성능이 떨어진다
- 불필요하게 너무 사용하게되면 오히려 가독성이 떨어진다.

---
# 함수형 인터페이스
자바에서 함수는 반드시 클래스 안에서 정의되어야 하기 때문에, 메서드가 
독립적으로 있을 수 없고 반드시 클래스 객체를 먼저 생성한 후 생성한 객체로 
메서드를 호출해야 한다.

메서드와 동일시 여겼던 람다식 또한 사실은 객체이다.
더 정확히는 이름이 없기 때문에 '익명 클래스' 라고 할 수 있다.

```java
//sum 메서드 람다식
(num1, num2) -> num1 + num2

//람다식을 객체로 표현
// 생성과 선언을 한번에 할 수 있다.
new Object() {
	int sum(int num1, int num2) {
    	return num1 + num2;
      }
 }      
```

> 익명 클래스란?
객체의 선언과 생성을 도시에 하여 오직 하나의 객체를 생성하고, 단 한번만 
사용되는 일회용 클래스

만약 람다식이 객체라 하면 이 객체에 접근하고 사용하기 위한 참조변수가 
필요하다
그런데 기존에 객체를 생성할 때 만들었던 Object클래스에는 sum 메서드가 없기 
때문에, Object 타입의 참조변수에 담는다고 하더라도 sum 메서드를 사용할 수 
없다.

```java
public class LambdaExample01 {
	public static void main(String[] args) {
    	Object obj = new Object() {
        int sum (int num1, int num2) {
        	return num1 + num2;
            }
        };
        // 람다식 Object obj = (num1, num2) -> num1 + num2 대체 가능
     }   
```
위 예제에서 익명 객체를 생성하여 참조변수 obj에 담아준다 하더라도 sum 
메서드를 사용할 수 있는 방법은 없다.

이 같은 문제를 해결하기 위해 사용하는 자바의 문법 요소가 바로 '함수형 
인터페이스(Functional Interface)'라 할 수 있다.

다르게 표현하면, 자바에서 함수형 프로그래밍을 하기 위한 새로운 문법 요소를 
도입하는 대신, 기존의 인터페이스 문법을 활용해 람다식을 다루는 것이라 할 
수 있다.
이게 가능한 이유는 람다식도 결국 하나의 객체이기 때문에 인터페이스에 
정의된 추상메서드를 구현할 수 있기 때문이다

함수형 인터페이스에는 단 하나의 추상 메서드만 선언될 수 있는데, 이것은 
어렵지 않게 유추할 수 있는것처럼 람다식과 인터페이스의 메서드가 1:1 로 
매칭되어야 하기 때문이다.

```java
public class LambdaExample01 {
	public static void main(String[] args) {
    /*	Object obj = new Object() {
        int sum (int num1, int num2) {
        	return num1 + num2;
            }
      };
      */
      ExampleFunction exampleFunction = (num1, num2) -> num1 + num2
      System.out.println(exampleFunction.sum(10,15))
      }
@FunctionalInterface // 컴파일러가 인터페이스가 바르게 정의되엇는지 
확인할수 있도록
interface ExampleFunction {
	public abstract int sum(int num1, int num2);
    }
    
 //출력값: 25
```
자바의 문법 요소를 해치지 않으며 원하는 결과를 도출할 수 있다.
이렇게 함수형 인터페이스를 사용하면 참조변수의 타입으로 함수형 
인터페이스를 사용하여 우리가 원하는 메서드에 접근이 가능하다.

## 매개변수오 리턴값이 없는 람다식
```java
@FunctionalInterface
public interface MyFunctionalInterface {
	public void accept();
 }   
 
 // 람다식
 // 매개변수가 없는 accept()가 매개변수를 가지지 않기 때문에
 MyfunctionalInterface example = () -> {...}
 
 //example.accept();
```
람다식이 대입된 인터페이스의 참조 변수는 주석과 같이 accept()를 호출이 
가능하다
accept()의 호출은 람다식의 중괄호 {} 를 실행시킨다.

```java
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) throws Exception {
    MyFunctionalInterface example;
    example = () -> {
    	String str = "첫 번째 메서드 호출";
        System.out.println(str);
        };
        example.accept();
        
        example = () -> System.out.println("두 번째 메서드 호출");
        //실행문이 하나면 {} 생략 가능
        example.accept();
        }
    }
    //출력값 
    //첫 번째 메서드 호출
    //두 번째 메서드 호출
```

## 매개변수가 있는 람다식
```java
@FunctionalInterface
public interface MyFunctionalInterface {
	public void accept(int x);
    }
```

```java
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) throws Exception {
    MyFunctionalInterface example;
    example = (x) -> {
    	int result = x * 5;
        System.out.println(result);
        };
        example.accept(2);
        
        example = (x) -> System.out.println(x * 5);
        example.accept(2);
        }
  }
  
  //출력값
  //10
  //10
```
람다식이 대입된 인터페이스 참조 변수는 다음과 같이 accept()를 호출할 수 
있다, 위 예시처럼 매개값으로 2를 주면 람다식의 x 변수에 2 가 대입되고, x 
는 중괄호 {}에서 사용된다.


## 리턴값이 있는 람다식
```java
@FunctionalInterface
public interface MyFunctionalInterface {
	public int accept(int x, int y);
    }
```
이번엔 accept()가 리턴 타입이 있기에 중괄호 안에 return문이 있어야 한다.

```java
public class MyFunctionalInterfaceExample {
	public static void main(String[] args) throws Exception {
    MyFunctionalInterface.example;
  	example = (x, y) -> {
    	int result = x + y;
        return result;
        };
        int result1 = example.accept(2, 5);
        System.out.println(result1);
        
        example = (x, y) -> { return x + y; }
        int result2 = example.accept(2, 5);
        System.out.println(result2);
        
        example = (x, y) -> x + y;
        // 실행문이 한 줄인 경우, 중괄호 {}, return문 생략 가능
        int result3 = example.accept(2, 5);
		System.out.println(result3);
        
        example = (x, y) -> sum(x, y);
        int result4 = example.accept(2, 5);
        System.out.println(result4);
    }
     public static int sum(int x, int y) {
     	return x + y;
        }
     }
//출력값
7
7
7
7
```
