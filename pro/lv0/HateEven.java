package lv0;
import java.util.ArrayList;
import java.util.List;

public class HateEven {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int a = 0;
        for(int i = 1; i<n+1; i++){
            if(i%2!=0){
                answer[a] = i;
                a++;
            }
        }
//        List<Integer> answer = new ArrayList<>();
//        for (int i = 1; i <= n; i++) {
//            if (i % 2 == 1) {
//                answer.add(i);
//            }
//        }
//        return answer.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}
