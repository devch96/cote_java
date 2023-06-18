import java.util.Arrays;
import java.util.stream.IntStream;

public class DifCalArrayLength {
    public static int[] solution(int[] arr, int n){
        if(arr.length % 2 != 0){
            return IntStream.range(0,arr.length).mapToObj(i -> i % 2 == 0 ? arr[i]+n : arr[i]).mapToInt(obj -> obj).toArray();
        } else{
            return IntStream.range(0,arr.length).mapToObj(i -> i % 2 != 0 ? arr[i]+n : arr[i]).mapToInt(obj -> obj).toArray();
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {49, 12, 100, 276, 33}, 27)));
    }
}
