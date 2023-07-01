package lv1;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class BetweenAandB {
    public static long solution(int a, int b){
        return LongStream.rangeClosed(Math.min(a,b),Math.max(a,b)).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(99,-100));
    }
}
