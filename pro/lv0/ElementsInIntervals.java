import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ElementsInIntervals {
    public static int[] solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < num_list.length; i+=n){
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ElementsInIntervals.solution(new int[]{4, 2, 6, 1, 7, 6}, 2)));
    }
}
