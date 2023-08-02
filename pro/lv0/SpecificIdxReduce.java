package lv0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SpecificIdxReduce {
    public static int solution(int a, int b, boolean[] included){
        return IntStream.range(0,included.length).filter(i -> included[i] == true).reduce(0,(acc, operand) -> acc + (a+(operand*b)));
    }

    public static void main(String[] args) {
        System.out.println(solution(3,4, new boolean[] {true, false, false, true, true}));
    }
}
