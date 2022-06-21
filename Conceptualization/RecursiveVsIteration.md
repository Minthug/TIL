# iteration (반복문)
- 기본: 일련의 명령을 반복적으로 실행할 수 있다.
- 체재: 반복에는 초기화, 조건, 루프 내의 명령문 실행 및 제어 변수 
업데이트가 포함된다
- 종료: 특정 조건에 도달할 때까지 반복적으로 실행된다
- 조건: 반복문의 제어 조건이 참이라면 무한 반복이 발생한다
- 무한반복: 무한 루프는 [CPU 사이클](https://gamedevlog.tistory.com/71)을 
반복적으로 사용
- 스택 메모리: 스택 메모리는 사용하지 않는다.
- 속도: 빠른 실행
- 가독성: 코드 길이가 길어지고 변수가 많아져 가독성이 떨어진다

# Recursive Function (재귀 함수)
- 기본: 함수 자체를 호출한다
- 체재: 기본적으로 종료 조건만 지정한다 (조건이 추가 될 수 있다)
- 종료: 조건부 문은 함수 호출 본문에 포함되어 재귀 호출을 실행하지 않고 
함수를 강제로 반환한다.
- 조건: 기본적으로 조건에 수렴하지 않으면 무한 재귀가 발생한다.
- 무한반복: 무한 재귀는 스택 오버플로우를 일으킨다.
- 스택 메모리: 스택 메모리는 함수가 호출 될 때마다 새 로컬 변수와 매개 
변수 집합을 저장하는데 사용된다.
- 속도: 느린 실행
- 가독성: 코드 길이와 변수가 적어 가독성이 높다

## 코드를 보자
```java
public static List<String> inputCarName() {
	System.out.println("경주할 자동차를 입력, 이름은 쉼표(,) 기준으로 
구분")
    try {
    	return scanner.nextLine().split(",");
    catch (Exception e) {
    	System.out.println(e.getMessage() + "다시 입력하세요");
        return inputCarName();
        }
      }    
```

재귀 함수는 잘못된 입력 형식으로 함수 내부에서 예외가 발생할 경우 재귀 
호출을 통해 입력을 재요청하고있다.
특별한 로직 없이 내부가 단수하게 구현되어 구조적으로도 이해하기 쉽다

```java
public static List<String> inputCarNames() {
    System.out.println("경주할 자동차를 입력하세요. (이름은 쉼표(,) 
기준으로 구분");
    String carNames;
    boolean result;
    do {
        carNames = scanner.nextLine();
        try {
            result = InputValidator.validateForm(carNames);
        } catch (Exception e) {
            result = false;
            System.out.println(e.getMessage() + "다시 입력해주세요!");
        }
    } while (!result);
    return Arrays.asList(carNames.split(","));
}
```

대충 살펴보아도 반복문이 함수의 길이가 길어졌고, carName, result 같이 
내부에서 사용하는 변수가 많아졌다.
무엇보다도 코드만 보아선 이 함수가 어떤 역할을 하는지 직관적으로 파악하기 
어렵다.

두 코드를 비교해보면 반복문보다 재귀 함수를 사용하면 확실하게 코드의 
가독성이 좋아지는걸 볼 수 있다.
사용하는 변수의 개수도 줄어들고 구현이 반복문보다 간단하기 때문에 어렵고 
복잡한 문제도 빠르고 단순하게 접근할 수 있다.

하지만 위의 장점때문에 재귀 함수가 반복문보다 무조건 좋다 라고 말할수 
있는가?
대답은 '아니다', 재귀 함수엔 장점에 필적하는 단점도 존재하기 때문이다

재귀 함수는 스택 메모리를 사용하는데 재귀의 깊이가 깊어질때, stack 
overflow가 발생하여 프로그램이 비정상적으로 종료될 수 있다, 또한 함수가 
호출되고 종료될 때 스택 프레임을 구성하고 해제하는 과정이 반복문보다 
Overhead가 들기 때문에 속도도 훨씬 느리다.

> Overhead
오버헤드란? 어떤 처리를 하기 위해 들어가는 간접적인 처리 시간•메모리 등을 
말한다.

물론 재귀 함수의 단점을 보완하고자 '꼬리 재귀'라는 기법을 사용할 수 있다.
단, 컴파일러가 꼬리 재귀 최적화를 지원해야만 실질적으로 단점을 보완할 수 
있다.

```java
public int recursive(int n) {
	if(n == 1) {
    return 1;
    }
    return n + recirsive(n - 1);
}

public int tailRecursive(int n , int acc) {
	if(n == 1) {
    	return acc;
    }
    return tailRecursive(n - 1, acc);
 }
```
두 함수의 차이는 다음 호출을 위한 파라미터의 연산이 어디서 일어나는가 
이다.
즉, return 문에 연산이 있느냐 없느냐 차이라 볼 수 있다.

함수가 리턴된 후 아무 작업도 하지않도록 하는 것을 <code>꼬리 호출(tail 
call)</code>
이라 하며, 이런 구조를 '꼬리 재귀' 라 부르며, 이런 함수를 '꼬리재귀함수' 
라 한다.

```java
public int recursive(int n, int acc) {
	int value = 0;
    
    do {
    if (n ==1)
        return value + n;
    value = value + n;
    n = n - 1;
    } while(true);
}
```
꼬리 재귀는 연산이 return 문 이전에 이루어지고 다음 함수 호출 시 
파라미터를 통해 필요한 연산의 결과를 전달한다, 함수가 호출되는 시점에 
컴파일러는 꼬리재귀를 최적화 하는데, 이 과정에서 꼬리 재귀는 반복문으로 
변경된다.

기존 재귀 형태에서 최적화 가능한 형태로 변경하면서 컴파일시 반복문으로 
해석될 수 있도록 만들면 기존의 문제였던 메모리와 성능에 대한 문제를 해결할 
수 있다.

# 결론
재귀를 사용하여 반복 구조를 구현하면 복잡한 문제도 단순한 로직으로 해결할 
수 있고, 함수 내에서 사용하는 변수의 개수를 줄어 코드의 길이가 줄어들기 
때문에 **'읽기 좋은 코드'** 가 될 수 있다.

하지만 스택 메모리를 사용하는 재귀 함수는 콜 스택이 쌓이게 되면 스택 
오버플로우 를 유발할 수 있고 속도나 성능이 반복문보다 떨어지는 것이 
분명하게 존재한다

성능이 중요한 과거엔 반복문으로 구현하는게 더욱 좋은 방법이자 
해결법이였지만, 하드웨어의 발전으로 소프트웨어의 자체 성능에 대한 중요도가 
낮아져서 오히려 협업이 강조되는 요즘시기엔 코드의 가독성도 충분히 우선해서 
고려해볼만하다.

물론 컴파일러의 도움으로 최적화를 지원한다면 앞서 살펴본 성능 문제는 
해결할 수 있으니, 가독성과 성능의 장점을 얻을 수 있다.

하지만 무분별하게 재귀함수를 사용하면 스택오버플로우를 직면하니 재귀 
깊이가 예측 가능한 경우의 위주로 사용하는 것이 더 안전하고 현명할 것이다.
