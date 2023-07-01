package lv1;

import java.util.Arrays;
import java.util.Comparator;

public class IntegerSort {
    public static long solution(long n){
        String[] strArr = Arrays.stream(String.valueOf(n).split("")).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        return Long.parseLong(String.join("",strArr));
    }
}
