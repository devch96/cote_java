import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class FromBack5th {
    public static int[] solution(int[] num_list){
        return Arrays.copyOfRange(Arrays.stream(num_list).sorted().toArray(), 0, 5);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {12, 4, 15, 46, 38, 1, 14})));
    }
}
