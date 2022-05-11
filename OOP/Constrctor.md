## 생성자(constrctor)
자바에선 객체의 생성과 동시에 인스턴스 변수를 원하는 값으로 초기화할 수 
있는 생성자라는 메소드를 제공한다.
자바에서 생성자의 이름은 해당 클래스의 이름과 같아야한다.
즉, **Car클래스**의 **생성자의 이름**은 **Car**가 된다.

앞서 우리가 **<code>new</code>** 키워들 사용하여 객체를 생성할 때에 
호출되는 것이 생성자이다.
생성자라는 이름에서 생성자가 인스턴스를 생성하는 역할을 하다는 오해가 
발생하는데, **_주의하자!_**
인스턴스 생성을 담당하는 것은** <code>new</code>**이며, **생성자**는 
**인스턴스 변수들을 초기화하는 특수 메서드**이다.

또한 생성자는 메서드와 비슷한 구조를 가지고 있지만 2가지 부분에서 큰 
차이점을 가진다.
* 생성자의 이름은 클래스의 이름과 동일해야한다.
->만약 클래스 이름과 생성자의 이름이 다르다면 그 메서드는 더이상 
생성자로서의 기능을 하지못한다.

* 생성자는 리턴 타입이 없다.
-> 하지만 메서드에서 리턴 값이 없을 때 표시하는 <code>void</code> 키워드를 
사용하지 않는다.
그 이유는 무언가를 '리턴하지 않는다'를 의미하는 void 와는 다르게 생성자는 
리턴 타입 자체가 존재하지않는다.

* 생성자는 초기화를 위한 데이터를 인수로 전달받을 수 있다.


> 클래스명 (매개변수) { // 생성자 기본 구조
 ....생략.... //구현문
 }
 
 🔥 생성자도 오버로딩이 가능하다 (한 클래스 내에 여러 생성자가 존재할 수 
있다.)

## 생성자의 특징
생성자는 반환값이 없지만, 반환 타입을 void형으로 선언하지 않는다.
생성자는 초기화를 위한 데이터를 인수로 전달 받을 수 있다.
객체를 초기화하는 방법이 여러 개 존재할 경우에는 하나의 클래스가 여러 개의 
생성자를 가질 수 있다.
-> 생성자도 하나의 메소드이므로, 메소드 오버로딩(overLoading)이 가능하다.

```
Car(String modelName){}
Car(String modelName, int modelYear){}
Car(String modelName, int modelYear, String modelColor){}
Car(String modelName, int modelYear, String modleColor, int maxSpeeds){}
```

### 생성자의 선언
1. 클래스이름(){...} // 매개변수가 없는 생성자 선언
2. 클래스이름(pra1, pra2, ...) {...} // 매개변수가 있는 생성자 선언
-> 매개변수를 전달받아 인스턴스 변수를 초기화하는 생성자도 선언이 
가능하다.
```
Car(String modelName, int modelYear, String modleColor, int maxSpeeds){
	this.modelName = modelNamel;
    this.modelYear = modelYear;
    this.modelColor = modelColor;
    this.maxSpeeds = maxSpeeds;
    this.currentSpeed = 0;
```
 ⚠️ 예제처럼 클래스의 생성자는 어떠한 반환값도 명시하지 않음에 
주의해야한다.
생성자 호출
자바에선 new 키워드를 사용하여 객체를 생성할 때 자동으로 생성자가 
호출됩니다.

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
### 기본 생성자 (default constructor)
특별히 생성자를 정의하지 않고도 인스턴스를 생성할 수 있다.
자바 컴파일러가 기본 생성자(default constructor)라는 것을 기본적으로 
제공해 주기 때문!
기본 생성자는 매개변수를 하나도 가지지 않으며, 아무런 명령어도 포함하고 
있지 않는다.

> 클래스이름(){} // 기본 생성자<br>

⚠️ 만약 기본생성자가 아니라 이미 추가되어 있는 생성자

> Car(){}

기본 생성자는 어떠한 매개변수도 전달 받지 않으며, 기본적으로 아무런 동작도 
하지않는다.

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
이처럼 인스턴스 변수의 초기화는 생성자를 사용하여 수행할 수 있지만, 클래스 
필드에서 바로 수행 할수있다.

만약 매개변수를 가지는 생성자를 하나라도 정의했다면, 기본 생성자는 
자동으로 추가되지 않는다.
따라서 매개변수를 가지는 생성자를 하나 이상 정의한 후 기본 생성자를 
호출하면 오류가 발생할 것이다.


