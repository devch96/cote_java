package lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySlice {
    public static int[] solution(int n, long left, long right){
        List<Long> answer = new ArrayList<>();
        for(long i = left; i < right+1; i++){
            long x = Math.floorDiv(i,n);
            long y = Math.floorMod(i,n);
            answer.add(Math.max(x,y)+1);
        }
        return answer.stream().mapToInt(Long::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3,2,5)));
    }
}
