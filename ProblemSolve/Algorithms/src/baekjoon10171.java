public class baekjoon10171 {
    public static void main(String[] args) {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println("\\(__)|");

        // 그대로 하면 출력 형식이 잘못되었다고 에러 발생

        System.out.println( "\\    /\\\n" +
                            " )  ( ')\n" +
                            "(  /  )\n" +
                            " \\(__)|");
        // 가독성을 높이고 에러도 잡아냈다


        StringBuilder cat = new StringBuilder();
        cat.append("\\    /\\\n");
        cat.append(" )   ( ')\n");
        cat.append("(   /  )\n");
        cat.append(" \\(__)|\n");

        System.out.println(cat);

        //StringBuilder 이용
        //StringBuilder는 개행해주는 메소드가 따로 없어 각 열 끝에 \n 으로 개행해준다.

    }
}
