package lv0;
import java.util.Arrays;
import java.util.stream.IntStream;

 public class Special2DArr_1 {
    public static int[][] solution(int n){
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++){
               answer[i][i] = 1;
            }
        return answer;
    }

    public static void main(String[] args) {
        for(int[] arr : solution(3)){
            System.out.println(Arrays.toString(arr));
        }
    }
}
