public class StaticFieldTesting {
    public static void main(String[] args) {
        StaticFieldExample ts1 = new StaticFieldExample(); //객체 생성
        StaticFieldExample ts2 = new StaticFieldExample();

        ts1.test1 = 1000;
        ts2.test1 = 1500;

        System.out.println(ts1.test1);
        System.out.println(ts2.test1);

        ts1.test2 = 500;
        ts2.test2 = 2500;
        System.out.println(ts1.test2);
        System.out.println(ts2.test2);
    }
}
    class StaticFieldExample {
        int test1 = 10;
        static int test2 = 15;
    }


