public class MethodOverLoading {
    public static void main(String[] args) {
    Testing ts = new Testing(); // 객체 생성

    ts.play(50); // 메소드 호출
    ts.play(10,4);
    ts.play(10, 3.14);

    }
}



class Testing {
    static void play(int num1) {  // 메소드 오버로딩으로 play 이름의 메서드 3개를 만든다
        System.out.println(num1);
    }
    static void play(int num1, int num2){
        System.out.println(num1*num2);
    }
    static void play(int num1, double num2) {
        System.out.println(num1*num2);
    }
}