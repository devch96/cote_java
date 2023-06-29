package lv1;

import java.util.ArrayList;
import java.util.List;

public class SumOfMeasure {
    public static int solution(int n){
        List<Integer> measure = new ArrayList<>();
        for(int i = 1; i < Math.floor(Math.pow(n,0.5)+1); i++){
            if(n%i == 0){
                measure.add(i);
                if(Math.sqrt(n) != i){
                    measure.add(n/i);
                }
            }
        }
        return measure.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
