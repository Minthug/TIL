# 조건문
### if 문
if문의 소괄호 안에는 boolean값으로 평가 될 수 있는 조건식을 넣어주고, 
중괄호 안의 실행 블록에는 조건식이 참일 때 실행하고자 하는 소스코드를 
넣어주면 된다.
```
if(조건식){
// 조건식이 참이면 실행 되는 소스코드
}
```
{} 중괄호를 이용해 여러 문장을 하나의 단위로 묶을 수 있다, 이것을 
'블록(block)'이라 한다.

## if...else 문
if...else문은 조건식의 결과에 따라 실행 블록을 선택한다.
if문의 조건식이 true이면 해당 블록이 실행되고, false이면 다음으로 넘어가 
else if 블록을 검사한다.
else if 에 해당하는 모든 조건식이 false라면, 나머지 경우를 의미하는 else 
블록이 실행된다.

![](https://velog.velcdn.com/images/minthug94_/post/7bae3a2c-0a19-4bf4-8025-fc986c888331/image.png)


# Switch문
Switch문도 if문처럼 조건 제어문이다.
하지만 switch문은 if문처럼 조건식이 참일 경우 블록 내부의 실행문이 
동작하는 것이 아니라, **변수가 어떤 값을 갖느냐에 따라 실행문이 
선택된다.**
if문은 조건식의 결과가 참과 거짓 두 가지 밖에 없기 때문에 경우의 수가 
많아질수록 if-else를 반복적으로 추가해야 해서 코드가 복잡해진다.
그러나 switch문은 변수의 값에 따라 실행문이 결정되기 때문에 if문보다 
코드가 간결할 수 있다.

```

public class basic {

        public static void main (String[] args){
             Scanner myInput = new Scanner(System.in);
                String finger = myInput.nextLine(); //주사위 번호 입력

                switch (finger) {
                    case "1":
                        System.out.println("엄지");
                        break; //다음 case를 실행하지 않고, switch문 탈출!
                    case "2":
                        System.out.println("검지");
                        break;
                    case "3":
                        System.out.println("중지");
                        break;
                    case "4":
                        System.out.println("약지");
                        break;
                    case "5":
                        System.out.println("소지");
                        break;
                    default: //switch문의 괄호 안 값과 같은 값이 없으면, 
여기서 실행문 실행
                        System.out.println("없는 손가락! " + finger);
                        break;
                }
            }
        }
```
switch문은 괄호 안의 값과 동일한 값을 갖는 case로 가서 실행문을 실행한다.
그러나 만약 괄호 안의 값과 동일한 값을 갖는 case가 없으면 default로 가서 
실행문을 동작한다.(이때 default는 생략이 가능하다.)

num의 값과 case번호가 같으면 해당 case안의 실행문을 실행하고 실행이 
완료되면 break; 를 통해서 switch문을 탈출한다.
주의할 점은 만약, break;문을 작성하지 않으면 switch 문을 탈출하지않고 모든 
case문을 실행하게 되어 원하는 방식으로 동작하지 않는다.
이 상황을 **fall through** 라 한다.

switch문에는 <code>int</code> 뿐만 아니라, <code>char</code> 타입 변수도 
사용가능하며, 자바 7부터는 <code>String</code> 타입의 변수도 올 수 있다.

----------
알고리즘
먼저는 해결해야 할 문제가 무엇인지 바르게 정의해야 하고, 어떤 방법으로 
이를 해결할 수 있을 지에 대한 바른 솔루션이 필요할 것이다.

어떤 문제를 해결하기 위한 일련의 절차나 방법을 정해진 형태로 표현한 것을 
알고리즘이라고 한다.
알고리즘은 문제 해결을 위한 고민을 논리적으로 풀어내는 작업을 하는 방법
