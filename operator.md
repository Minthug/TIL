## 산술 연산자
산술 연산자는 사칙연산에 사용되는 연산자 (+,-,*,/)와 나머지 연산자인(%)를 
포함한다.

![](https://velog.velcdn.com/images/minthug94_/post/a5c89612-a616-4beb-881e-2e808ae491f0/image.png)

나머지 연산자(%)는 모듈로(modulo)연산자라고도 부르기도 한다.

## 비교 연산자
비교 연산자는 boolean 타입으로 평가될 수 있는 조건식에 사용되는데, 크게 
대소 비교(>,<,<=,>=)연산자와 등가 비교 (==,!=)연산자가 있다.

## 대소 비교 연산자
대소 비교 연산자는 boolean 타입을 제외한 나머지 기본 타입에 모두 사용이 
가능하다.
```
5 > 3 // true
5 <= 5 // true
3 > 2 // true
2 >= 3 // false
```
💡비교 연산자를 사용할 때 주의점
이항 비교만 가능하다.

## 등가 비교 연산자
등가 비교 연산자는 값이 동등한지의 여부를 판단할 때 사용한다.
값이 동등하면 true, 아니면 fals로 값이 반환된다.
```
5 == 3 // flase
5 == 5 // true
3 != 2 // true
3 != 3 // false
```

## 조건 연산자
조건 연산자는 조건식이 참일 때 결과, 거짓일 때 결과 세 개의 피연산자를 
필요로 하는 삼항 연산자이다.
![](https://velog.velcdn.com/images/minthug94_/post/9b30e3cb-d510-4317-ae70-1cce4957d395/image.png)
![](https://velog.velcdn.com/images/minthug94_/post/a7687d17-30fa-4e01-b995-1fb274126eee/image.png)

<code>equals()</code>는 문자열의 내용이 같은지 비교하는 메서드이다.
String은 참조 타입이기 때문에 <code>==</code> 등가 비교 연산자를 사용하게 
되면, 값을 직접 비교가 아닌
주소값을 비교하게 된다.
그러니 문자열이 나타내는 내용을 비교하려면 <code>equals()</code> 메서드를 
사용하자

## 연산자 우선순위
연산자에는 우선순위가 있다.
![](https://velog.velcdn.com/images/minthug94_/post/3f221c9a-fbee-4ded-8971-9639c974fea0/image.png)

----------

# 콘솔 출력

* 출력하기 : System.out.print();
<code>System.out.print()</code> 메서드는 소괄호 안의 내용을 단순히 출력만 
하며, 줄바꿈은 하지 않는다.

```
    public static void main(String[] args) {
        System.out.print("Hello JAVA");
        System.out.print("Kim" + "Minseok");
        System.out.print(10+12);
        System.out.print(2022 + "year");
    }
    출력값 Hello JAVAKimMinseok222022year
```
<code>System.out.print("Hello JAVA")</code>를 실행하면 소괄호 안의 내용이 
출력되고 커서는 "Hello JAVA"뒤로 이동한다.

### 출력하고 줄 바꾸기 : System.out.println();
<code>System.out.println()</code> 메서드는 소괄호 안의 내용을 콘솔에 
출력하고 줄바꿈을 한다. (print 뒤에 붙은 ln은 line을 의미한다)

```
public static void main(String[] args) {
	System.out.println("Hello JAVA");
	System.out.println("Kim" + "minthug");
	System.out.println(3+6);
	System.out.println(2022 + "year");
}
출력값
Hello JAVA
Kimminthug
9
2022year
```
<code>System.out.println("Java")</code>를 실행하면 소괄호 안의 내용이 
출력되고 커서는 다음 줄로 이동된다.

### 형식대로 출력하기 : System.out.printf();
<code>System.out.printf()</code> 메서드는 지시자(specifier, 형식 지정자)를 
이용해 변수의 값을 여러 형식으로 출력해주는 메서드 이다.
지시자는 이름 그대로 값을 어떤 형식으로 출력할 것인지 지정하기 위해 
사용된다.
(f는 formatted의 약자)

![](https://velog.velcdn.com/images/minthug94_/post/aa36ea1b-b343-44e8-bace-1d46f92c5cc8/image.png)

```
  System.out.printf("%s%n", "Hello JAVA"); // 줄바꿈이 됩니다.
        System.out.printf("%s%n", "Kim" + "minseok");
        System.out.printf("%d%n", 5+6);
        System.out.printf("지금은 %s입니다", 2022 + "year"); // 자동 타입 
변환이 일어납니다.
        System.out.printf("나는 %c%s입니다", '김', "민석"); //여러 개의 
인자를 넣을 수 있습니다.
```

# 콘솔 입력
```
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
String inputValue = sc.nextLine();

System.out.println(inputValue);
```

![](https://velog.velcdn.com/images/minthug94_/post/684d43c6-f8d5-492e-9465-7253b6b81c26/image.png)

**<code>import java.util.Scanner;</code>**
'java.util'에 있는 Scanner를 위 소스 코드에 불러와라 라는 의미이다

**<code>Scanner sc = new Scanner(System.in);</code>**
위에서 불러온 Scanner는 클래스이다.

클래스를 통해 객체를 만들어 낼 때에는 <code>new</code> 연산자를 사용하며, 
그 결과물로 만들어진 객체를 인스턴스라고 한다. 
이렇게 클래스에 <code>new</code> 연산자를 적용하여 인스턴스를 만드는 것을 
‘클래스를 인스턴스화한다'고 표현한다. 

위의 코드는 불러온 <code>Scanner</code> 클래스를 <code>new</code> 연산자를 
통해 인스턴스를 생성하고, 생성된 인스턴스를 변수 <code>scanner</code> 
할당하는 코드이다. 
데이터를 입력 받기 위한 준비 과정을 마쳤다.

**<code>String inputValue = sc.nextLine();</code>**
Scanner 클래스를 인스턴스화한 <code>scanner</code>에는 
<code>nextLine()</code>이라는 메서드가 존재한다. 
이 메서드는 콘솔을 통해 문자열 데이터를 입력 받는 기능을 수행한다. 
즉, <code>scanner.nextLine()</code>은 문자열을 입력받기 위한 코드이며, 
입력받은 문자열은 <code>inputValue</code>라는 변수에 할당되어 저장되었다.

참고로, <code>scanner</code>에는 문자열을 입력받는 
<code>nextLine()</code>뿐만 아니라, 정수형을 입력받을 수 있는 
<code>nextInt()</code>, 실수형을 입력받을 수 있는 
<code>nextFloat()</code>등의 메서드들도 존재한다.

