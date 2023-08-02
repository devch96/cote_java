package lv0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MakeArray_3 {
    public static  int[] solution(int[] arr, int[][] intervals){
        List<Integer> answer = new ArrayList<>();
        int[] array = Stream.of(intervals).flatMapToInt(Arrays::stream).toArray();
        for(int i = 0; i < array.length; i+=2){
            Arrays.stream(Arrays.copyOfRange(arr,array[i],array[i+1]+1)).forEach(x -> answer.add(x));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();

//        return Arrays.stream(intervals).flatMapToInt(ints -> Arrays.stream(Arrays.copyOfRange(arr, ints[0], ints[1]+1))).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5}, new int[][] {{1, 3}, {0, 4}})));
    }
}
