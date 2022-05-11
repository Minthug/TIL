## 메소드🔥
클래스에서 메소드란 어떠한 특정 작업을 수행하기 위한 명령문의 집합이라 할 
수 있다.
즉, 메소드를 사용하면 중복되는 코드의 반복적인 프로그래밍을 피할 수 있게 
된다.
또한, 모듈화로 인해 전체적인 코드의 가독성이 좋아진다.
프로그램에 문제가 발생하거나 기능의 변경이 필요할 때도 손쉽게 유지보수를 
할 수 있다.

>⚑ 메소드를 작성할땐 되도록 하나의 메소드가 하나의 기능을 수행하도록 
작성하자


```
접근제어자 반환타입 메소드이름(매개변수 목록) { // 선언부
//구현부
}
```
* 접근 제어자
해당 메소드에 접근할 수 있는 범위를 명시한다.

* 반환 타입 (return type)
메소드가 모든 작업을 마치고 반환하는 데이터 타입을 명시한다.

* 메소드 이름
메소드를 호출하기 위한 이름을 명시한다.

* 매개변수 목록 (parameters)
메소드 호출 시에 전달되는 인수의 값을 저장할 변수들을 명시한다.

* 구현부
메소드의 고유 기능을 수행하는 명령문의 집합

```
class Vehicle {
	private int currentSpeed;
    private int accelerationTime;
 ...
 
 public void accelerate(int speed, int sec) { // 선언부
 // 구현부
 	System.out.println(sec +" 간 속도를 시속 " + speed + " 로 가속한다 
" );
 }
```

>⚑메소드 시그니처 (method signature)
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

>예) Vehicle myVehicle = new Vehicle(); // 객체 생성
>> myVehicle.accelerate(60,3); // myVehicle 인스턴스의 
accelerate()메소드를 호출함

```
class Vehicle {
	private int currentSpeed;
    private int accelerationTime;
 ...
 
 public void accelerate(int speed, int sec) { // 선언부
 	System.out.println(sec +" 초간 속도를 시속 " + speed + " 로 
가속한다 " );  // 구현부
 	}
 }
 
 public class Example{
 public static void main(String[] args) {
 	Vehicle myVehicle = new Vehicle(); // 객체 생성
    myVehicle.accelerate(60,3); // 메소드 호출
 -> 3초간 속도를 60speed 로 가속한다
 	}
 }
```

