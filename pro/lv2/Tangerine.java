package lv2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Tangerine {
    public static int solution(int k, int[] tangerine){
        int answer = 0;
        Map<String, Integer> countMap = new HashMap<>();
        for(int i : tangerine){
            countMap.put(String.valueOf(i), countMap.getOrDefault(String.valueOf(i),0)+1);
        }
        Integer[] arr = countMap.values().stream().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
        for(int i : arr){
            if(k > i){
                k -= i;
                answer++;
            }else{
                answer++;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
