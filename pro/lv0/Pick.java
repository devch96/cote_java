import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Pick {
    public static int[] solution(int[] arr, int k){
        List<Integer> answer = new ArrayList<>();
        for(int num : arr){
            if(!answer.contains(num) && answer.size() < k){
                answer.add(num);
            }
        }
        if(answer.size() < k){
            for(int i = answer.size(); i < k; i++){
                answer.add(-1);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
