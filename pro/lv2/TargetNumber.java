package lv2;

import java.util.ArrayDeque;
import java.util.Deque;

public class TargetNumber {
    public static int solution(int[] numbers, int target){
        Deque<Deque<Integer>> deque = new ArrayDeque<>();
        int answer = 0;
        for(int idx = 0 ; idx < numbers.length; idx++){
            if(idx == 0){
                Deque<Integer> temp = new ArrayDeque<>();
                temp.add(numbers[idx]);
                temp.add(numbers[idx] * -1);
                deque.add(temp);
            }else if(idx == numbers.length-1){
                Deque<Integer> before = deque.pollFirst();
                while (!before.isEmpty()) {
                    int beforeNum = before.pollFirst();
                    if(beforeNum + numbers[idx] == target || beforeNum - numbers[idx] == target){
                        answer++;
                    }
                }
            } else{
                Deque<Integer> before = deque.pollFirst();
                Deque<Integer> now = new ArrayDeque<>();
                while (!before.isEmpty()) {
                    int beforeNum = before.pollFirst();
                    now.add(beforeNum + numbers[idx]);
                    now.add(beforeNum - numbers[idx]);
                }
                deque.add(now);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,1,1,1,1}, 3));
    }
}
