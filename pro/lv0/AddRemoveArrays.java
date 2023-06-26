import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class AddRemoveArrays {
    public static int[] solution(int[] arr, boolean[] flag){
        Stack<Integer> answer = new Stack<>();
        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++) {
                    answer.add(arr[i]);
                }
            }else{
                for(int j = 0; j < arr[i]; j++) {
                    answer.pop();
                }
            }
        }
        return Arrays.stream(answer.toArray(new Integer[0])).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {3, 2, 4, 1, 3}, new boolean[] {true, false, true, false, false})));
    }
}
