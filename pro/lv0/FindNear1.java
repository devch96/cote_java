import java.util.Arrays;
import java.util.stream.IntStream;

public class FindNear1 {
    public static int solution(int[] arr, int idx){
        return IntStream.range(0, arr.length).filter(i -> i >= idx && arr[i] == 1).findFirst().orElse(-1);
    }
}
