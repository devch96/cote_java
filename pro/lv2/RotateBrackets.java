package lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RotateBrackets {
    public static int solution(String s){
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            String temp = s.substring(i).concat(s.substring(0,i));
            if(checkBracket(temp)){
                answer++;
            }
        }
        return answer;
    }

    public static boolean checkBracket(String s){
        List<Character> strList = new ArrayList<>(){
            {
                add(')');
                add('}');
                add(']');
            }
        };
        if(strList.contains(s.charAt(0))){
            return false;
        }
        Stack<Character> stk = new Stack<>();
        for (char c : s.toCharArray()) {
            if(stk.isEmpty()){
                stk.push(c);
            }else{
                if(c == ')' && stk.peek()=='('){
                    stk.pop();
                }else if (c == '}' && stk.peek() == '{') {
                    stk.pop();
                }else if (c == ']' && stk.peek() == '[') {
                    stk.pop();
                }else{
                    stk.push(c);
                }
            }
        }
        return stk.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(solution("[](){}"));
        System.out.println(solution("}]()[{"));
        System.out.println(solution("[)(]"));
        System.out.println(solution("}}}"));
    }
}
