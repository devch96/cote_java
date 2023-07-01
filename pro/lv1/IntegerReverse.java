package lv1;

import java.util.Arrays;

public class IntegerReverse {
    public static int[] solution(long n){
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        return Arrays.stream(sb.reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }
}
