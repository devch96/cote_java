package lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Fruit {
    public static int solution(int k, int m, int[] score){
        Integer[] intArr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(intArr, Collections.reverseOrder());
        int answer = 0;
        for(int idx = m-1; idx<score.length; idx+=m){
            answer += intArr[idx] * m;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4,3,new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}));
    }
}
