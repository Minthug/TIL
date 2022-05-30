import java.lang.*;

public class helloworld {

    public static void main(String[] args) {
//        ??? Object obj = (a, b) > a>b ? a:b;  // 람다식 익명 객체

//    MyFunction2 f = new MyFunction2() {
//        @Override
//       public int max(int a, int b) {  // 오버라이딩 = 접근제어자는 좁게 못쓴다
//            return a > b ? a : b;
//        }

        //람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction2 f = (a, b) -> a > b ? a : b; // 람다식


    int value = f.max(3, 5); // 함수형 인터페이스가 필요하다
        System.out.println("value = "+value);
    }
}

@FunctionalInterface // 함수형 인터페이슨 단 하나의 추상 메서드만 가져야한다.
interface MyFunction2 {
//    public abstract int max(int a, int b);
     int max(int a, int b);
}
