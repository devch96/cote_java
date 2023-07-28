package lv2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Carpet {
    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int maxLen = (int)Math.sqrt(yellow);
        int row = 1;
        int col;
        for(;row <= maxLen;row++){
            if(yellow % row != 0)
                continue;
            col = yellow/row;
            if(((row + col)*2 + 4) == brown)
            {
                answer[0] = Math.max(col, row)+2;
                answer[1] = Math.min(col, row)+2;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(18,6)));
    }
}
