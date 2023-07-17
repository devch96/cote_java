package lv1;

import java.util.Arrays;

public class NumFair {
    public static String solution(String X, String Y){
        int[] count = new int[10];
        StringBuilder sb = new StringBuilder();

        for (char c : Y.toCharArray()) {
            if (Character.isDigit(c)) {
                count[c - '0']++;
            }
        }

        for (char c : X.toCharArray()) {
            if (Character.isDigit(c) && count[c - '0'] > 0) {
                sb.append(c);
                count[c - '0']--;
            }
        }

        if (sb.length() == 0) {
            return "-1";
        }

        char[] sol = sb.toString().toCharArray();
        Arrays.sort(sol);
        StringBuilder answer = new StringBuilder(new String(sol)).reverse();
        if(answer.charAt(0) == '0'){
            return "0";
        }else{
            return answer.toString();
        }
    }
}
