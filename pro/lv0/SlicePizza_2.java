public class SlicePizza_2 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return Math.abs(a);
    }

    public static long lcm(long a, long b){
        int gcd_value = gcd((int) a, (int) b);
        return Math.abs((a*b)/gcd_value);
    }

    public int solution(int n){
        return (int) (lcm(n, 6)/n);
    }
}
