import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAdd {
    public static int[] solution(int[] arr){
        List<Integer> answer = new ArrayList<>();
        Arrays.stream(arr).forEach(i -> {for(int x = 0 ; x < i ; x ++){answer.add(i);}});
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
