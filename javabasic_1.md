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


