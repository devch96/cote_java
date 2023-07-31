package lv2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class H_Index {
    public static int solution(int[] citations){
        int answer = 0;
        Integer[] boxedCitations = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedCitations, Comparator.reverseOrder());
        for (int idx = 0; idx < boxedCitations.length; idx++) {
            if (idx + 1 <= boxedCitations[idx]) {
                answer = idx+1;
            }else{
                break;
            }
        }
        return answer;
    }
}
