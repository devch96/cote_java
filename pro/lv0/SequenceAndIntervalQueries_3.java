import java.util.Arrays;

public class SequenceAndIntervalQueries_3 {
    public static int[] solution(int[] arr, int[][] queries){
        Arrays.stream(queries).forEach(i -> {
            int temp = 0;
            temp = arr[i[0]];
            arr[i[0]] = arr[i[1]];
            arr[i[1]] = temp;
        });
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {0, 1, 2, 3, 4}, new int[][] {{0,3},{1,2},{1,4}})));
    }
}
