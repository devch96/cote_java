package lv2;

import java.util.*;
import java.util.stream.Collectors;

public class Process {
    public static int solution(int[] priorities, int location){
        Deque<Integer> deque = Arrays.stream(priorities)
                .boxed()
                .collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Integer> index = new ArrayDeque<>();
        int count = 0;
        for (int i = 0; i < priorities.length; i++) {
            index.add(i);
        }
        int maxPriority = deque.stream().max(Integer::compareTo).orElse(0);
        while(!deque.isEmpty()){
            if(deque.peekFirst() != maxPriority){
                deque.add(deque.pollFirst());
                index.add(index.pollFirst());
            } else{
                count++;
                deque.pollFirst();
                if(location == index.pollFirst()){
                    break;
                }else{
                    maxPriority = deque.stream().max(Integer::compareTo).orElse(0);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
    }
}
