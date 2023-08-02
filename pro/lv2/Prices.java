package lv2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Prices {
    public int[] solution(int[] prices){
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i : prices){
            deque.add(i);
        }
        while (!deque.isEmpty()) {
            int count = 0;
            int now = deque.pollFirst();
            for(Integer s : deque) {
                count++;
                if (now > s) {
                    break;
                }
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
