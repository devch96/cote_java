package lv2;

import java.util.Stack;

public class PairRemove {
    public static int solution(String s){
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if(stk.isEmpty()){
                stk.push(c);
            }else if(stk.peek() == c){
                stk.pop();
            }else{
                stk.push(c);
            }
        }
        return stk.isEmpty() ? 0 : 1;
    }
}
