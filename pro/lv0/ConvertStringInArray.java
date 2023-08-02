package lv0;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConvertStringInArray {
    public static String[] solution(String[] strArr){
        return IntStream.range(0, strArr.length)
                .mapToObj(i -> i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase())
                .toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ConvertStringInArray.solution(new String[] {"AAA","BBB","CCC","DDD"})));
    }
}
