### 다형성이란?
여러 가지 형태를 가질 수 있는 능력을 말하며, 자바에선 한 타입의 참조 
변수로 여러 타입의 객체를 참조할 수 있도록 함이라고 정리된다.

한마디로 같은 자료형에 여러 가지 객체를 대입하여 다양한 결과를 얻어내는 
성질을 말한다.

```
class parent {...}
class child extends parent {...}
...

Parent pr = new Parent(); // 가능
Child ch = new Child(); // 가능
Parent pc = new Child(); // 가능
Child cp = new Parent(); // 불가능
```
>⚑ 상위 클래스 타입의 참조 변수로 하위 클래스 타입의 인스턴스를 참조 할 
수 있다.
참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스 멤버 개수보다 적기 
때문
반대로, 하위 클래스 타입의 참조 변수로는 상위 클래스 타입의 인스턴스를 
참조할 수 없다.
참조 변수가 사용할 수 있는 멤버의 개수가 실제 인스턴스 멤버 개수보다 많기 
때문

>⚠️클래스는 상속을 통해 확장될 순 있어도 축소될 수 없으므로, 하위 
클래스에서 사용할 수 있는 멤버의 개수가 언제나 상위 클래스와 같거나 많게 
된다.
하위(4) > 상위(3)

## 캐스팅이란?
타입을 변환하는 것을 말하며 형변환이라고도 한다, 자바에서 상속 관계에 있는 
상위와 하위 클래스 간에는 서로 간의 형변환이 가능하다.

## 업캐스팅(Upcasting)
하위 클래스의 객체가 상위 클래스 타입으로 형변환 되는 것을 말한다.
즉, 상위 클래스 참조 변수가 하위 클래스로 객체화된 인스턴스를 가리킬 수 
있게 된다.
예시로는 **사람은 생물이다** 여기서 사람은 하위 클래스, 생물은 상위 
클래스이다.

![](https://velog.velcdn.com/images/minthug94_/post/f7531992-8311-42cf-9420-0f83df2c7bc1/image.png)

![](https://velog.velcdn.com/images/minthug94_/post/753d78a1-60b3-4ae2-9338-a7fc301c241c/image.png)


## 다운캐스팅(Downcasting)
다운캐스팅은 자신의 고유한 특성을 잃은 하위 클래스의 객체를 다시 복구 
시켜주는 것을 말한다.
즉, 업캐스팅된 것을 다시 원상태로 돌리는 것

![](https://velog.velcdn.com/images/minthug94_/post/bbba7703-516d-4df2-9f6c-e474894d4290/image.png)

![](https://velog.velcdn.com/images/minthug94_/post/9120e9f8-4cb8-43a4-ae92-472d16e31ed9/image.png)

업캐스팅과의 다른 점은 명시적으로 타입을 지정해야한다.
그리고 업캐스팅이 선행 되어야 하는 조건도 있다.
다운 캐스팅을 하면서 형변환할 대상을 지정했지만 무분별한 다운캐스팅은 
컴파일 시점에는 오류가 발생하지않아도, 런타임 오류를 발생시킬 가능성이 
있다.


## instanceof 연산자
객체의 타입을 구분하기 위해 <code>instanceof</code> 연산자를 사용할 수 
있다.

![](https://velog.velcdn.com/images/minthug94_/post/c430fb97-4d30-4490-a5e1-cba7dbbbd817/image.png)

![](https://velog.velcdn.com/images/minthug94_/post/59d872ea-7527-4763-8673-0d15783f45a4/image.png)

이렇게 instanceof 연산자를 사용하면 객체의 타입을 쉽게 구별할 수 있다.
연산의 결과 타입은 <code>boolean</code> 이며 false값은 출력되지않았다.

