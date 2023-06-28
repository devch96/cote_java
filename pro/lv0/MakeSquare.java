import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MakeSquare {
    public int[][] solution(int[][] arr){
        int side = Math.max(arr.length,arr[0].length);
        int[][] answer = new int[side][side];
        for(int i = 0; i < side; i++){
            int[] temp = new int[side];
            if(i < arr.length) {
                for (int j = 0; j < side; j++) {
                    if(j < arr[0].length){
                        temp[j] = arr[i][j];
                    }else{
                        temp[j] = 0;
                    }
                }
            } else{
                for(int j = 0; j < side; j++){
                    temp[j] = 0;
                }
            }
            answer[i] = temp;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new int[][] {{1,2},{3,4}}));
    }
}
