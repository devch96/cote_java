package lv2;

public class Nx2 {
    public static int solution(int n) {
        int[] answer = new int[60001];
        answer[1] = 1;
        answer[2] = 2;
        for (int i = 3; i <= n ; i++) {
            answer[i] = (answer[i-1] + answer[i-2]) % 1000000007;
        }
        return answer[n] % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
