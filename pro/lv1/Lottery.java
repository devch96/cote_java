package lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lottery {
    public static int[] solution(int[] lottos, int[] win_nums){
        int max = 7;
        int min = 7;
        Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new)));
        for(int i = 0; i < lottos.length; i++){
            if(lottos[i] == 0){
                max--;
            }else{
                if(set.contains(lottos[i])){
                    min--;
                    max--;
                }
            }
        }
        return new int[] {Math.min(max,6),Math.min(min,6)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {44, 1, 0, 0, 31, 25}, new int[] {31, 10, 45, 1, 6, 19})));
        System.out.println(Arrays.toString(solution(new int[] {0,0,0,0,0,0}, new int[] {0,0,0,0,0,0})));
    }
}
