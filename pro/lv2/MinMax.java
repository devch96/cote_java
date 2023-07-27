package lv2;

import java.util.Arrays;

public class MinMax {
    public static String solution(String s){
        int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(a);
        String answer = "";
        answer = answer + a[0] + " " + a[a.length-1];
        return answer;
    }
}
