package lv0;
import java.util.Arrays;

public class SequenceAndIntervalQueries_4 {
    public static int[] solution(int[] arr, int[][] queries){
        Arrays.stream(queries).forEach(query -> {
            for(int i = query[0]; i <= query[1] ;i++){
                if(i%query[2] == 0){
                    arr[i] += 1;
                }
            }
        });
        return arr;
    }
}
