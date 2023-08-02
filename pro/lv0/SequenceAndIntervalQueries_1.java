package lv0;
import java.util.Arrays;

public class SequenceAndIntervalQueries_1 {
    public static int[] solution(int[] arr, int[][] queries){
        Arrays.stream(queries).forEach(array -> {
            for(int i = array[0]; i<=array[1]; i++){
                arr[i] += 1;
            }
        });
        return arr;
    }
}
