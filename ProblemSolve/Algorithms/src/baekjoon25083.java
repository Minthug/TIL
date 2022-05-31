public class baekjoon25083 {

    public static void main(String[] args) {
        String s = "         ,r'\"7\n" + 	// \", \n 이 제어문자다.
                "r`-_   ,'  ,/\n" + 		// \n 이 제어문자다.
                " \\. \". L_r'\n" + 		// \\, \", \n 이 제어문자다.
                "   `~\\/\n" + 			// \\, \n 이 제어문자다.
                "      |\n" + 			// \n 이 제어문자다.
                "      |";

        System.out.print(s);

        // 기본 출력 문제이지만 아직 확실하게 이스케이프 시퀀스를 숙지하지 못하고있다.
        // System.out.println(s); 로 진행하여 출력값이 틀렸다고 나왔다
        // 사실 아직 왜 ln으로 했을때 틀렸는지 정확히 알 수 없다.
        // println과 print로 출력했을때 차이에 대해 추후 작성해보자

    }
}