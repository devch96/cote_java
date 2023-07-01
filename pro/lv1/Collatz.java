package lv1;

public class Collatz {
    public static int solution(int num){
        int count = 0;
        long n = num;
        while(count <= 500){
            if(n == 1){
                break;
            }else{
                if(n % 2 == 0){
                    n /= 2;
                }else{
                    n = (n*3) + 1;
                }
            }
            count++;
        }
        return count > 500 ? -1 : count;
    }

    public static void main(String[] args) {
        System.out.println(solution(626331));
    }
}
