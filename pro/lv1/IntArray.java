package lv1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArray {
    public int solution(int[] numbers){
        return IntStream.rangeClosed(0,9).filter(i -> !Arrays.stream(numbers).anyMatch(num -> num == i)).sum();
    }
}
