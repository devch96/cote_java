package lv2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class BackNum {
    public static int[] solution(int[] numbers){
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < numbers.length; i++) {
            while(!deque.isEmpty() && numbers[deque.peekLast()] < numbers[i]){
                answer[deque.pollLast()] = numbers[i];
            }
            deque.add(i);
        }
        return answer;
    }
}
