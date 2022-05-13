# final 키워드
사전적으론 '최종의','마지막의'의 뜻을 가지고 있다.
final 키워드는 변수, 메서드, 클래스에 사용 될수 있으며, <code>final</code> 
키워드는 그 위치에 따라 의미가 조금씩 다르다.

### 필드
```
final int number = 1; // final 타입 필드 [= 초기값]
```
final 필드의 초기값을 줄 수 있는 방법은 두 가지 방법이 있다.
* 필드 선언시에 주는 방법
* 생성자를 통해서 주는 방법

단순한 값이라면 필드 선언시에 주는것이 가장 간단하다 
하지만 복잡한 초기화 코드가 필요하거나 객체 생성 시에 외부 데이터로 초기화 
시켜야한다면 생성자를 통해서 초기값을 부여하는 방법을 써야한다

생성자는 final 필드의 최종 초기화를 마쳐야하는데 만약 초기화가 되지 않은 
final 필드가 있으면 컴파일 에러가 발생한다.


### 변수
<span style="color:yellow">**변수에 final을 붙이면 이 변수는 수정할 수 
없다**</span> 라는 의미를 가진다.
수정될 수 없기 때문에 초기화 값은 필수적이 된다.
만약 객체안의 변수라면 생성자, static 블럭을 통한 초기화까진 허용이 된다.

```
final Company company = new Company();
        company.setName("e회사");

        System.out.println(company.getName());
    }
}

class Company {
    String name = "회사명";

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
```

### 클래스
클래스에 final을 사용하게되면 그 클래스는 최종상태가 되어 더이상 상속이 
불가하다
final 클래스여도 필드는 setter를 이용해 변경이 가능하다.

```
final class Company {
    String name = "회사명";
}

class Acompany extends Company{ // error msg : Cannot inherit from final 
'Company'

}
```

### 메서드
메서드에 final을 사용하게되면 상속받은 클래스에서 상위의 final 메서드를 
오버라이딩 할수 없다.
자신이 만든 메서드를 변경할 수 없게끔 하고싶을땐 사용된다.

>⚑ 시스템 코어 부분에서 변경을 원치 않는 메서드에 많이 구현되어있다한다.

```
class Company {
    String name = "회사명";

    public final void print() {
        System.out.println("회사 이름은 : " + name + " 입니다.");
    }
}

class Acompany extends Company {
    String name = "A회사";
    public void print(){ // error msg : 'print()' cannot override 
'print()' in 'Company'; overridden method is final

    }
}
```

### 메서드 인자값에 final 사용하는 상황
```
public static void main(String[] args) {

	final Company company = new Company();
    company.setName("ex회사");

    }

class Company {
    String name = "회사명";

    public void setName(final String name) {
        this.name = name;
    }
}
```

# 인터페이스
사전적의미는 "서로 다른 두 시스템, 장치, 소프트웨어 따위를 서로 이어 주는 
부분 또는 그런 접속 장치"를 말한다.
자바에서 인터페이스도 이와 유사한 기능을 지니고 있다.

하위 클래스가 여러 상위 클래스를 상속받을 수 있다면, 다양한 동작을 수행할 
수 있다는 장점을 가지게 될 것이다.
하지만 클래스를 이용하여 다중 상속을 할 경우엔 메소드 출처의 모호성 및 
여러 가지 문제가 발생할 수 있어 자바에선 클래스를 통한 다중 상속은 
지원하지 않고있다.

하지만 그렇다고 다중 상속의 이점을 버릴 수는 없기에, 자바에서는 
"인터페이스" 라는 것을 통해 다중 상속을 지원하고 있다!

자바에선 추상 클래스는 추상 메소드, 생성자, 필드, 일반 메소드를 포함할 수 
있다,
하지만 인터페이스는 오로지 추상 메소드와 상수만을 포함할 수 있다.

## 인터페이스 선언
```
접근제어자 interface 인터페이스이름 {
	public static final 타입 상수이름 = 값;
    ...
    public abstract 메소드이름(매개변수목록);
	...
}
```
클래스와는 달리 인터페이스의 모든 필드는 public static final이여야 하며, 
모든 메소드는 public abstract 여야 한다.

모든 인터페이스에 공통으로 적용되는 부분이므로 이 제어자는 생략할 수 있다.
생략된 제어자는 컴파일 시 자바 컴파일러가 자동으로 추가해준다.

## 인터페이스의 구현
인터페이스는 추상 클래스와 마찬가지로 자신이 직접 인스턴스를 생성할 수 
없다.
그러니 인터페이스가 포함하고 있는 추상 메소드를 구현해 줄 클래스를 
작성해야한다.

```
class 클래스이름 implements 인터페이스이름{...}
```
만약 모든 추상 메서드를 구현하지 않는다면, abstract 키워드를 사용해 추상 
클래스로 선언해야 한다.


![](https://velog.velcdn.com/images/minthug94_/post/c14467b5-b993-4345-a4dc-4729d7342e7f/image.png)

>출력값
>> coding
cleaning

>⚑ class 클래스이름 extend 상위클래스이름 implements 인터페이스이름 {...}
자바에선 위와 같이 상속과 구현을 동시에 할수도 있다.
⚠️ 또한 인터페이스는 인터페이스로부터만 상속 받을수 있으며, 여러 
인터페이스를 상속 받을수 있다.


