package lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Average {
    public double solution(int[] arr) {
        return IntStream.range(0,arr.length).map(i -> arr[i]).sum() / (double) arr.length;
    }
}
