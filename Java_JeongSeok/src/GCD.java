import java.util.;

public class Solution {
    public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        // 최대공약수를 구하는 공식을 쓰고
        // int GCD = gcd(M, N);
        // 오름차순 정렬도 써야함
        // 제곱근 // 제곱근을 기준으로  < >
        // 1. 제곱근을 기준으로, 제곱근보다 숫자가 작을경우, 제곱근보다 숫자가 클 경우
        // GCD % 숫자 = 0
        ArrayList<Integer[]> result = new ArrayList<>();
        int GCD = gcd(M, N);

        int sqrt = (int)Math.floor(Math.sqrt(GCD));

        for(int i = 1; i <= sqrt; i++) {
            if(GCD % i == 0) {
                result.add(new Integer[]{i, M/ i, N/ i});
                if(i i < GCD) {
                    int x = GCD / i;
                    result.add(new Integer[]{x, M/x, N/x});
                    // 1 2 3 6 9 18  // 18의 약수
                    // 1 3 9 // 9의 약수
                    //
                }
            }
        }
        return result;
    }
    public int gcd(int M, int N) {
        if (M % N == 0) return N;
        return gcd(N, M % N);
    }
}