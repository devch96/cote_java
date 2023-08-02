package lv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMeasure {
    public List<Integer> solution(int n){
        List<Integer> answer = new ArrayList<>();
        for(int i = 1 ; i <= (int) Math.sqrt(n); i++){
            if(n % i == 0){
                answer.add(i);
                if(n/i != i){
                    answer.add(n/i);
                }
            }
        }
        Collections.sort(answer);
        return answer;
    }
}
