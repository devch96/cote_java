import java.util.Arrays;

public class ConvertSequence_3 {
    public int[] solution(int[] arr, int k){
        return Arrays.stream(arr).map(k%2 == 0 ? i -> i+k : i -> i*k).toArray();
    }
}
