package lv1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CardStack {
    public String solution(String[] cards1, String[] cards2, String[] goal){
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));
        for(String word : goal){
            if(!queue1.isEmpty() && queue1.peek().equals(word)){
                queue1.poll();
            } else if (!queue2.isEmpty() && queue2.peek().equals(word)) {
                queue2.poll();
            }else{
                return "No";
            }
        }
        return "Yes";
    }
}
