public class DiceGame_1 {
    public static int solution(int a, int b){
        if((a*b) % 2 != 0){
            return a*a + b*b;
        } else if (a%2 != 0 || b%2 != 0) {
            return 2 * (a+b);
        } else{
            return Math.abs(a-b);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(2,4));
    }
}
