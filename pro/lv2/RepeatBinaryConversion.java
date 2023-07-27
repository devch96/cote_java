package lv2;

import java.util.Arrays;

public class RepeatBinaryConversion {
    public static int[] solution(String s){
        int totalZeroCount = 0;
        int totalConversionCount = 0;
        while(!s.equals("1")){
            String temp = s.replace("0","");
            totalZeroCount += s.length() - temp.length();
            s = Integer.toBinaryString(temp.length());
            totalConversionCount++;
        }
        return new int[]{totalConversionCount, totalZeroCount};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
    }
}
