package lv2;

import java.util.Arrays;
import java.util.Stack;

public class TagWords {
    public static int[] solution(int n, String[] words){
        int wrongPerson = 0;
        int wrongOrder = 0;
        Stack<String> stk = new Stack<>();
        for (int idx = 0; idx < words.length; idx++) {
            int nowPlayerNumber = (idx % n) + 1;
            int nowOrder = (idx / n) + 1;
            if(stk.empty()){
                stk.push(words[idx]);
            }else{
                String beforeWord = stk.peek();
                if (beforeWord.charAt(beforeWord.length() - 1) != words[idx].charAt(0) || stk.contains(words[idx])) {
                    wrongPerson = nowPlayerNumber;
                    wrongOrder = nowOrder;
                    break;
                } else{
                    stk.push(words[idx]);
                }
            }
        }
        return new int[] {wrongPerson, wrongOrder};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"})));
    }

}
