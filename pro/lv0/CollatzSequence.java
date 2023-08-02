package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollatzSequence {
    public static int[] solution(int n){
        List<Integer> answer = new ArrayList<>();
        answer.add(n);
        while(n > 1){
            if(n%2 == 0){
                n /= 2;
            } else{
                n = 3 * n + 1;
            }
            answer.add(n);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10)));
    }
}
