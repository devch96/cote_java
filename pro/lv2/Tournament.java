package lv2;

public class Tournament {
    public static int solution(int n, int a, int b){
        int round = 1;
        a--;
        b--;
        while(a/2 != b/2){
            a = a/2;
            b = b/2;
            round++;
        }
        return round;
    }
}
