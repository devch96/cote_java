package lv2;

import java.util.*;
import java.util.stream.Collectors;

public class MakeMin {
    public static int solution(int[] A, int[] B){
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int idx = 0; idx < A.length; idx++){
            answer+= A[idx] * B[B.length-idx-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 4, 2}, new int[] {5, 4, 4}));
    }
}
