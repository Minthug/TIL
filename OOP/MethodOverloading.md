### 메소드 오버로딩이란?
같은 이름의 메소드를 중복하여 정의하는 것을 말한다.
자바에선 원래 한 클래스 내에 같은 이름의 메소드를 둘 이상 가질 수 없다.

하지만 매개변수나 타입을 다르게하면, 하나의 이름으로 메소드를 중복 작성이 
가능하다.
즉, 메소드 오버로딩은 서로 다른 시그니처를 가진 여러 메소드를 같은 
이름으로 정의하는 것이라 할 수 있다.

이렇게 메소드 오버로딩을 사용함으로써 메소드에 사용되는 이름을 절약할 수 
있다.
또한, 메소드를 호출할 때 전달해야 할 매개변수의 타입이나 개수에 대해 크게 
신경 쓰지 않고 호출할 수 있다.

🔥 메소드 오버로딩은 객체 지향 프로그래밍의 특징 중 하나인 
다형성(polymorphism)을 구현하는 방법 중 하나

```
public class MethodOverLoading {
    public static void main(String[] args) {
    Testing ts = new Testing(); // 객체 생성

    ts.play(50); // 메소드 호출
    ts.play(10,4);
    ts.play(10, 3.14);

    }
}



class Testing {
    static void play(int num1) {  // 메소드 오버로딩으로 play 이름의 
메서드 3개를 만든다
        System.out.println(num1);
    }
    static void play(int num1, int num2){
        System.out.println(num1*num2);
    }
    static void play(int num1, double num2) {
        System.out.println(num1*num2);
    }
}
```

⚠️ 반환 타입은 오버로딩이 성립하는 데에 영향을 주지 못한다.
* 메서드를 오버로딩하는 조건은
   - 메서드의 이름이 같아야한다.
   - 매개변수의 개수 또는 타입이 달라야한다.
  

