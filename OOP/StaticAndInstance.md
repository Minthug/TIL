# Static & Instance

👉🏼 [클래스 및 인스턴스 개념 정리](https://velog.io/@minthug94_/OOP1)

코드스테이츠에서 감사하게도 두 개의 차이점을 보여주는 자료를 만들어주어서
복습 및 자습 겸 글을 쓰게되었다.

<span style="color : indianred">뭔가 이해되지만 애매하게 내 안에 남아있는 
느낌이다.

코드로 작성해 내용을 이해해보자 :)
```
class Cafe {
    public String Latte = "InstanceVariable";
  	인스턴스 변수를 초기화
  
    public static String Amricano = "ClassVariable";
	클래스 변수를 초기화
```
연결해놓은 글에서도 볼 수 있지만, static 유무로 클래스 변수 선언이 된다.
  또한 그것을 <code>공유변수</code>라고도 지난 글에 설명을 해놓았다.
  
더 쉽게 풀어낸다면 클래스 변수는 멤버변수 중 모든 인스턴스가 공통적으로 값을 
사용해야하는 것에 사용한다.

반면에 인스턴스 변수는 인스턴스 마다 고유의 값을 유지 해야할 때 사용한다.

  ```
    public static void amricano() {
       System.out.println(Latte); ② < error msg >  
        System.out.println(Amricano); ①
    }
  // < error msg > Non-static field 'Latte' cannot be referenced from a 
static context 
```
  
① 클래스 메소드에서 클래스 변수는 접근 가능하다
  1번은 클래스 메서드에서 클래스 변수를 호출하는 모습

  ② 클래스 메서드에서는 인스턴스 변수에 접근이 불가하다
	2번은 클래스 메서드에서 인스턴스 변수를 호출하는 모습이다.
 
  왜일까? 
 왜 클래스 변수는 그냥 호출이 되었지만, 인스턴스 변수는 호출이 안될까?
  인스턴스 변수는 인스턴스를 생성해야만 만들어지기 때문에 
<code>static</code>이 붙은 메서드에서 인스턴스 변수의 사용을 허용하지않는다. 
  
```
    public void latte() {
        System.out.println(Latte);
        System.out.println(Amricano);
    }
}
 
  인스턴스 메서드에선 클래스 변수 인스턴스 변수를 호출하는데 문제가 없다.
```

  반대로 인스턴스 변수나 메서드에선 <code>static</code>이 붙은 멤버들을 
호출할 수 있다.
```
public static void main(String[] args) {
	System.out.println(Cafe.Amricano);
  	System.out.println(Cafe.Latte); <error msg>
  
  	Cafe.amricano();
  	Cafe.latte(); < error msg>
  
}
```
위의 에러와 동일한 "참조할 수 없다" 라는 내용의 에러 메세지를 받았다.
참조할 수 없다는 굉장히 중요하다
(.) 을 통해 주소값을 찾아가 객체의 접근 해야 하는데, 참조하려면 메모리 상에 
인스턴스가 있어야하는데 인스턴스가 없으니 참조 불가하다라는 에러가 
나오는거다.
  
  
  ```
  public static void main(String[] args) {
        Cafe cafe1 = new Cafe();
        Cafe cafe2 = new Cafe();

        cafe1.Amricano = "This is ClassVairable";
        System.out.println(cafe1.Amricano);
        System.out.println(cafe2.Amricano);
        System.out.println(Cafe.Amricano);
```
```
출력 값
This is ClassVairable
This is ClassVairable
This is ClassVairable
```
static 변수가 메모리의 1개의 값을 가지고 모든 멤버들과 공유하기에 위 결과가 
나왔다.
  
```
  public static void main(String[] args){
        cafe1.Latte = "This is InstanceVariable";
        System.out.println(cafe1.Latte);
        System.out.println(cafe2.Latte);
   }
```
```
출력 값
This is InstanceVariable
InstanceVariable
```

 이렇게 두 개의 결과를 극명하게 볼 수 있다.
 인스턴스 cafe1 스트링 구문을 바꾸어서 할당했지만, 출력 값에서
 cafe1은 당연히 설정해놓은 구문을 출력했다 하지만 cafe2 에서는 
<code>static</code> 과 다르게 처음 필드에서 할당해놓은 값이 출력되었다.

  
이 글은 아마 주기적으로 업데이트가 될 예정이다.
  
  
