package lv1;

public class HarshadNumber {
    public static boolean solution(int x){
        int total = 0;
        int temp =x;
        while(x > 0){
            total += x % 10;
            x /= 10;
        }
        return temp % total == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
