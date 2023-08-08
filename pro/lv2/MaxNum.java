package lv2;

import java.util.Arrays;
import java.util.Comparator;

public class MaxNum {
    public static String solution(int[] numbers) {
        Integer[] arr = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                o1 = Integer.parseInt(String.valueOf(o1).repeat(4).substring(0,4));
                o2 = Integer.parseInt(String.valueOf(o2).repeat(4).substring(0,4));
                return o2-o1;
            }
        });
        String[] strArr = Arrays.stream(arr).map(i -> String.valueOf(i)).toArray(String[]::new);
        String answer = String.join("", strArr);
        return answer.charAt(0) == '0' ? "0" : answer;
    }
}
