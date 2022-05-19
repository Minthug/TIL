# Enum - 열거형
JDK 1.5 이전 버전에선 enum을 지원하지 않았다.
enum이 등장하기 전에는 여러 상수를 정의해서 사용하기 위해선 public static 
final을 통해
전역변수로 상수를 설정해서 사용했다.

## Enum의 등장 배경
'복잡한 값을 👉🏼 단순한 값으로'
상수는 변하지 않는다는 특징을 이용해 복잡한 값 👉🏼 단순한 값으로 치환해 
사용할 수 있다.

```
  int type = 1;
    switch (type) {
        case 1:
            System.out.println("banana");
            break;
        case 2:
            System.out.println("apple");
            break;
        case 3:
            System.out.println("lemon");
            break;

    }
```
P - 치환한 값에 대한 정보(주석처리)가 삭제될 경우 || 복잡한 코드로 주석을 
찾기 어려워 질 경우 번호의 의미를 알 수 없다.
S - 주석 삭제 후 변하지 않는 클래스 변수로 설정해 상수명 사용

```
   private final static int BANANA = 1;
    private final static int APPLE = 2;
    private final static int LEMON = 3;
    
    public static void main(String[] args) {
        int type = BANANA;
        switch (type) {
            case 1:
                System.out.println("banana");
                break;
            case 2:
                System.out.println("apple");
                break;
            case 3:
                System.out.println("lemon");
                break;
        }
    }
}
```
#### 변하지 않는 클래스 변수로 설정
final static으로 설정해 주석 없이도 의미를 파악 할 수 있게 했다.
P - 만약 같은 상수명을 갖는 다른 의미의 값이 존재하면 에러가 발생할 수 
있다.
```
    private final static int BANANA = 1;
    private final static int APPLE = 2;
    private final static int LEMON = 3;

    private final static int GOOGLE = 1;
    private final static int APPLE = 2;
    private final static int MS = 3;    

```
S - interface를 통한 상수명 구체화를 통해 상수명의 중복을 피할 수 있다.

```

interface FRUIT {
     final static int BANANA = 1;
     final static int APPLE = 2;
     final static int LEMON = 3;
}
interface COMPANY {
     final static int GOOGLE = 1;
     final static int APPLE = 2;
     final static int MS = 3;
}
```

Interfaec로 상수명 구체화

P - 의미로 비교할 수 없는 상수 간의 비교가 가능하다 (비교해도 컴파일 
에러가 나지 않는다)
```
        if (FRUIT.APPLE == COMPANY.APPLE) {
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
```
S - 인스턴스 생성으로 데이터 타입을 구별해 비교 시 컴파일 에러가 나도록 
프로그래밍한다.

```
class Fruit {
    public final static Fruit APPLE = new Fruit();
    public final static Fruit BANANA = new Fruit();
    public final static Fruit LEMON = new Fruit();

}

class Company {
    public final static Company GOOGLE = new Company();
    public final static Company APPLE = new Company();
    public final static Company MS = new Company();
}
```
P - switch문의 조건문에는 사용자 정의 클래스를 사용 할 수 없다.
>The switch Statement
Unlike if-then and if-then-else statements, the switch statement can have 
a number of possible execution paths. A switch works with <span style 
="color:indianred"> **the byte, short, char, and int primitive data 
types.**</span> It also works with <span style ="color: 
indianred">**enumerated types (discussed in Enum Types), the String class, 
and a few special classes that wrap certain primitive types: Character, 
Byte, Short, and Integer**</span>(discussed in Numbers and Strings).


S - 모든 조건을 만족시키는 Enum 을 써보자

```
FRUIT type = FRUIT.BANANA;
        switch (type) {
        case BANANA:
        System.out.println("banana");
        break;
        case APPLE:
        System.out.println("apple");
        break;
        case LEMON:
        System.out.println("lemon");
        break;

		}


	}
}

enum FRUIT {BANANA, APPLE, LEMON}

enum COMPANY {GOOGLE, APPLE, MS}

```

# enum 장점
- 코드의 양이 줄었다
- 인스턴스 생성과 상속 시도 시, 컴파일 에러
- enum이라는 키워드로 열거형의 의도를 잘 나타냄


-----
출처 url : https://heepie.me/32

