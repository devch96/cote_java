package lv2;

public class LongJump {
    public static long solution(int n){
        int[] fib = new int[n+1];
        fib[0] = 1;
        fib[1] = 1;
        for(int i = 2; i <= n; i++){
            fib[i] = (fib[i-2] + fib[i-1]) % 1234567;
        }
        return fib[n] % 1234567;
    }


    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
