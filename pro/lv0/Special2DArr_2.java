package lv0;
import java.util.stream.IntStream;

 public class Special2DArr_2 {
    public static int solution(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] != arr[j][i]){
                    return 0;
                }
            }
        }
        return 1;

//        return IntStream.range(0, arr.length).allMatch(i -> IntStream.range(i + 1, arr.length).allMatch(j -> arr[i][j] == arr[j][i])) ? 1 : 0;

    }
}
