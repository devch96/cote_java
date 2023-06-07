import java.util.Arrays;
import java.util.Collections;

public class OperationAlongTheLength {
    public static int solution(int[] num_list){
        int answer;
        if (num_list.length >= 11){
            answer = 0;
            for(int i : num_list){
                answer += i;
            }
        }else {
            answer = 1;
            for(int i : num_list){
                answer *= i;
            }
        }
        return answer;

        /*
        IntStream stream = IntStream.of(num_list);
        return num_list.length>10?stream.sum():stream.reduce(1, (a,b) -> a*b);
         */
    }

    public static void main(String[] args) {
        System.out.println(OperationAlongTheLength.solution(new int[] {3,4,5,2,5,4,6,7,3,7,2,2,1}));
        System.out.println(OperationAlongTheLength.solution(new int[] {2,3,4,5}));

    }
}
