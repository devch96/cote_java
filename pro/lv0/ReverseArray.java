package lv0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {
    public int[] solution(int[] num_list){
        int[] answer = new int[num_list.length];
        for(int i=num_list.length-1, j=0; i>-1; i--, j++){
            answer[j] = num_list[i];
        }
//        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
//        Collections.reverse(list);
//        return list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

}
