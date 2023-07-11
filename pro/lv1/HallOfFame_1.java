package lv1;

import java.util.*;

public class HallOfFame_1 {
    public static int[] solution(int k, int[] score){
        int[] answer = new int[score.length];
        List<Integer> rank = new ArrayList<>();
        for(int idx = 0; idx < score.length; idx++){
            if(rank.size() == k){
                if(rank.get(0) < score[idx]) {
                    rank.set(0, score[idx]);
                }
            }else{
                rank.add(score[idx]);
            }
            rank.sort(Comparator.naturalOrder());
            answer[idx] = rank.get(0);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,new int[] {10, 100, 20, 150, 1, 100, 200})));
    }
}
