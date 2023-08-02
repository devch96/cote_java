package lv0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class CountDown {
    public static int[] solution(int start, int end){
        return Arrays.stream(IntStream.rangeClosed(end,start).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray()).toArray();

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,3)));
    }
}
