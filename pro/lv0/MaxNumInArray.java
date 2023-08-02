package lv0;
import java.util.Arrays;

public class MaxNumInArray {
    public int[] solution(int[] array){
        int max = array[0];
        int index = 0;
        for(int i=0; i< array.length; i++){
            if(max<array[i]){
                max = array[i];
                index = i;
            }
        }
        int[]answer = new int[]{max, index};
        return answer;
    }
}
