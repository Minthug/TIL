## super 🔥
super 키워드는 상위 클래스로부터 상속받은 필드나 메소드를 자식 클래스에서 
참조하는데 사용하는 참조 변수이다.

인스턴스 변수의 이름과 지역 변수의 이름이 같을 경우 인스턴스 변수 앞에 
this 를 넣어 구분할 수 있었다.
마찬가지로 상위 클래스의 멤버와 하위 클래스의 멤버 이름이 같을 경우 super 
를 이용해 구별할 수 있다.

> super 참조 변수를 사용해 부모 클래스의 멤버에 접근할 수 있다.
this와 동일하게 super참조 변수를 사용할 수 있는 대상도 인스턴스 메소드 
뿐이며, 클래스 메소드에선 사용불가

![](https://velog.velcdn.com/images/minthug94_/post/9e7244c8-68d4-47a0-acb0-7bf8f5a96ca6/image.png)

>값은
>>100
100
100

![](https://velog.velcdn.com/images/minthug94_/post/a9d3cc47-763b-4fae-bb3e-eb32d7c6d6b2/image.png)

>값은
>>50
50
100


----
# super() 🔥
this()가 같은 클래스의 다른 생성자를 호출할 때 사용되면, super()는 상위 
클래스의 생성자를 호출할 때 사용된다.

하위 클래스의 인스턴스를 생성하면, 해당 인스턴스에는 하위 클래스의 고유 
멤버뿐만 아니라 상위 클래스의 모든 멤버까지도 포함 되어있다.

따라서 상위 클래스의 멤버를 초기화하기 위해선 하위 클래스의 생성자에서 
상위 클래스의 생성자까지 호출해야한다.
이러한 상위 클래스의 생성자 호출은 모든 클래스의 상위 클래스인 Object 
클래스의 생성자까지 거슬러 올라가며 수행된다.

따라서 자바 컴파일러는 상위 클래스의 생성자를 명시적으로 호출하지 않은 
모든 하위 클래스의 생성자 첫 줄에 자동으로 명령문을 추가하여, 상위 
클래스의 멤버를 초기화할수 있도록 해준다.
```
super();
```

그치만 자바 컴파일러는 컴파일 시 클래스에 생성자가 하나도 정의되어 있지 
않아야만, 자동으로 기본 생성자를 추가해준다.

아래와 같이 상위 클래스에서 매개변수를 가지는 생성자를 하나라도 
선언한다면, 상위 클래스에는 기본 생성자가 자동으로 추가되지 않는다.

```
class Super {
	int a;
    Super(int n){a = n;}
}
```

만약 Super 클래스를 상속받은 하위 클래스에서 super(); 를 사용하여 상위 
클래스의 기본 생성자를 호출했다면, 오류가 발생하게 될 것이다.
```
class Super {
	int a;
    Super(int n){a = n;}
}

class Sub extends Super {
	int b;
    Sub() {
    super();
    b = 20;
    }

}
```

이유는 상위 클래스인 Super 클래스에는 기본 생성자가 추가되어 있지 
않기때문이다
따라서 매개변수를 가지는 생성자를 선언해야 할 경우에는 되도록 기본 
생성자까지 명시적으로 선언하자

```
class Super {
	int a;
    Super(){a = 10;}
    Super(int a) {a = n;}
}

class Sub extends Super {
	int b;
    Sub() {
    super();
    b = 20;
    }

}
```

