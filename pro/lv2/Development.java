package lv2;

import java.util.*;

public class Development {
    public static int[] solution(int[] progresses, int[] speeds){
        List<Integer> answer = new ArrayList<>();
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i : progresses) {
            queue.add(i);
        }
        while(!queue.isEmpty()){
            int count = 0;
            while(queue.peekFirst() < 100){
                for(int idx = speeds.length - queue.size(); idx < speeds.length; idx++){
                    int num = queue.removeFirst();
                    num += speeds[idx];
                    queue.add(num);
                }
            }
            while(!queue.isEmpty() && queue.peekFirst() >= 100){
                count++;
                queue.pollFirst();
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1})));
    }
}
