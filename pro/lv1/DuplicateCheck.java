package lv1;

import java.util.Stack;

public class DuplicateCheck {
    public int[] solution(int[] arr){
        Stack<Integer> stk = new Stack<>();
        for(int idx = 0; idx < arr.length; idx++){
            if(stk.isEmpty() || stk.peek() != arr[idx]){
                stk.push(arr[idx]);
            }
        }
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}
