package lv2;

public class RepresentationOfNumber {
    public static int solution(int n){
        int count = 0;
        int d = 1;
        while(n>0){
            if(n%d == 0){
                count++;
            }
            n -= d;
            d +=1 ;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
