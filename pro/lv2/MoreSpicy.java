package lv2;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MoreSpicy {
    public static int solution(int[] scoville, int k){
        PriorityQueue<Integer> foods = new PriorityQueue<>(scoville.length);
        foods.addAll(Arrays.stream(scoville).boxed().toList());
        int answer = 0;
        while(foods.size()>1){
            int firstFood = foods.poll();
            if(firstFood >= k){
                break;
            }
            int secondFood = foods.poll();
            foods.add(firstFood + 2*secondFood);
            answer++;
        }
        return foods.isEmpty()||foods.peek()<k ? -1 : answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,1,1,1,1,1}, 100));
    }
}
