package lv0;
import java.util.Scanner;

public class EvenOdd {
    public int[] solution(int[] num_list){
        int even = 0;
        int odd = 0;
        for(int num:num_list){
            if(num%2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(String.format("%d is even", n));
        }else{
            System.out.println(String.format("%d is odd", n));
        }
    }
}
