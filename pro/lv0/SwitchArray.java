import java.util.Arrays;
import java.util.stream.IntStream;

public class SwitchArray {
    public static int[] solution(int[] num_list, int n){
        return IntStream.concat(Arrays.stream(Arrays.copyOfRange(num_list,n,num_list.length)),Arrays.stream(Arrays.copyOfRange(num_list,0,n))).toArray();
//        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }
}
