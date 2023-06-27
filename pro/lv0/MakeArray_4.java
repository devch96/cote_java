import java.util.Arrays;
import java.util.Stack;

public class MakeArray_4 {
    public static int[] solution(int[] arr){
        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(stk.isEmpty()){
                stk.push(arr[i]);
            } else if (stk.peek() < arr[i]) {
                stk.push(arr[i]);
            } else {
                stk.pop();
                i--;
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 4, 2, 5, 3})));
    }
}
