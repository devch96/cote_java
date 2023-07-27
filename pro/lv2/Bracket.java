package lv2;

import java.util.Stack;

public class Bracket {
    public boolean solution(String s){
        Stack<Character> openBrackets = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if(bracket == '('){
                openBrackets.push(bracket);
            }else{
                if(openBrackets.isEmpty()){
                    return false;
                }else{
                    openBrackets.pop();
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
