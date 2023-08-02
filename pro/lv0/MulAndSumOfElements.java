package lv0;
import java.util.Arrays;

public class MulAndSumOfElements {
    public static int solution(int[] num_list){
        return Arrays.stream(num_list).reduce(1, (a,b) -> a*b) < Math.pow(Arrays.stream(num_list).sum(),2)? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(MulAndSumOfElements.solution(new int[] {3,4,5,2,1}));
    }
}
