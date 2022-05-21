# 스레드
사전적 의미론 "한가닥의 실" 이라는 뜻
순차적으로 실행한 코드가 실처럼 이어져서 유래된 이름
하나의 스레드는 하나의 코드 실행 흐름이기 때문에 한 프로세스 내에 스레드가 
두개라면 두 개의 코드 실행 흐름이 생긴다는 것이다.

# 프로세스(Process)
프로세스는 단순히 실행 중인 프로그램이라고 할 수 있다.
사용자가 작성한 프로그램이 운영체제에 의해 메모리 공간을 할당받아 실행 중 
인것을 말한다.
이런 프로세스는 프로그램에 사용되는 데이터와 메모리 등의 자원 그리고 
스레드로 구성되어있다.

## 멀티 스레드(Multi-Thread)
멀티 스레드는 애플리케이션 내부에서의 멀티 태스킹이라 할 수 있다.
대용량 데이터 처리 시간을 줄이기 위해, 데이터를 분할해서 병렬로 처리하는 
곳에서 사용되기도하고
UI를 가지고있는 애플리케이션에서 네트워크 통신을 하기 위해 사용되기도 
한다.

## 메인 스레드(main thread)
모든 자바의 애플리케이션은 메인스레드가 main()메서드를 실행하면서 
시작된다.
메인 스레드는 main() 메서드의 첫 코드부터 아래로 순차적으로 실행되며, 
main()메서드가 마지막 코드를 실행하거나 return 문을 만나면 실행이 
종료된다.

메인 스레드는 필요에 따라 작업 스레드들을 만들어서 동시에 코드를 실행할 수 
있다.
즉, 멀티 스레드를 생성해서 멀티 태스킹을 수행한다.

## 스레드의 생성과 실행
- Runnable 인터페이스를 구현하는 방법
- Thread 클래스를 상속받는 방법
두가지 방법 모두 스레드를 통해 작업하고 싶은 내용을 run()메소드에 작성하면 
된다.

```
package practicPack.testPack;

public class threadEx {
    public static void main(String[] args) {
        ThreadWithClass thread1 = new ThreadWithClass(); // Thread 
클래스를 상속받는 방법
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 
인터페이스를 구현하는 방법

        thread1.start();
        thread2.start();
    }
}

class ThreadWithClass extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println(getName()); // 현재 실행중인 스레드의 
이름을 반환
        try {
            Thread.sleep(10); // 0.01초간 스레드를 멈춤
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}

class ThreadWithRunnable implements Runnable {
    public void run(){
        for (int i = 0; i <5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 
실행중인 스레드 이름을 반환
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
```

> Runnable 인터페이스는 몸체가 없는 run() 메서드 하나만을 가지는 간단한 
인터페이스이다

## Thread 우선순위
자바에선 각 스레드는 우선순위에 관한 자신만의 필드를 가지고 있다.
이런 우선순위에 따라 특정 스레드가 더 많은 시간 작업을 할 수 있도록 설정할 
수 있다.

|필드|설명
|--|--
|static int MAX_PRIORITY|스레드가 가질 수 있는 최대 우선순위를 명시한다
|static int MIN_PRIORITY|스레드가 가질 수 있는 최소 우선순위를 명시한다
|static int NORM_PRIORITY|스레드가 생성될 때 가지는 기본 우선순위를 
명시한다.

getPriority() 와 setPriority() 메서드를 통해 스레드의 우선순위를 
반환하거나 변경 할 수 있다.
스레드의 우선순위가 가질 수 있는 범위는 1부터 10까지이며, 숫자가 높을수록 
우선순위 또한 높아진다.

스레드 우선순위는 비례적인 절댓값이 아닌 상대적인 값일뿐이다.
우선순위가 10인 스레드가 우선순위 1인 스레드보다 10배 빨리 수행되는것은 
아니다
단지 우선순위가 10인 스레드는 우선순위 1인 스레드보다 좀 더 많이 실행 큐에 
포함되어, 좀 더 많은 작업 시간을 할당 받을 뿐이다.
```
public class threadEx {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadWithRunnable());
        Thread thread2 = new Thread(new ThreadWithRunnable());

        thread2.setPriority(10); // Thread-1의 우선순위를 10으로 변경

        thread1.start(); // Thread-0 실행
        thread2.start(); // Thread-1 실행

        System.out.println(thread1.getPriority()); 
        System.out.println(thread2.getPriority());
    }
}

class ThreadWithRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()); // 현재 
실행중인 스레드의 이름을 반환
        try {
            Thread.sleep(10);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        }
    }
}
```

main()메서드를 실행하는 스레드의 우선순위는 언제나 5이다

## Thread 동기화 및 상태
### 동기화 메서드와 동기화 블록
멀티 스레드 프로그램에서 스레드들이 객체를 공유해서 작업해야하는 경우가 
있다.
이 때 스레드가 사용 중인 객체를 다른 스레드가 변경할 수 없도록 하려면 
스레드 작업이 끝날 때까지 객체에 잠금을 걸어서 다른 스레드가 사용할 수 
없도록 해야한다.

멀티 스레드 프로그램에서 단 하나의 스레드만 실행할 수 있는 코드 영역을 
'임계 영역' 이라 한다.
자바는 임계 영역을 지정하기 위해서 동기화 메서드와 동기화 블록을 제공한다.

스레드가 객체 내부의 동기화 메서드 혹은 블록에 들어가면 즉시 객체에 잠금을 
걸어 다른 스레드가 임계 영역 코드를 실행하지 못하도록 해야한다

동기화 메서드 만드는 방법은 선언에 <code>synchronized</code> 키워드를 
붙이면 된다.
이 키워드는 인스턴스와 정적 메서드 어디든 붙일 수 있다.

