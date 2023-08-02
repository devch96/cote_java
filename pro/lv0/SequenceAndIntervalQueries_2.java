package lv0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SequenceAndIntervalQueries_2 {
    public static int[] solution(int[] arr, int[][] queries){
        return Arrays.stream(queries).mapToInt(query -> {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            return IntStream.rangeClosed(s,e).filter(i -> arr[i] > k).map(i -> arr[i]).min().orElse(-1);
        }).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {0,1,2,4,3}, new int[][] {{0, 4, 2},{0, 3, 2},{0, 2, 2}})));
    }
}
