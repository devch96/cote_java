package lv1;

import java.util.Arrays;

public class DivisorArray {
    public static int[] solution(int[] arr, int divisor){
        int[] answer = Arrays.stream(arr).sorted().filter(i -> i%divisor == 0).toArray();
        return answer.length > 0 ? answer : new int[] {-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {3,2,6}, 10)));
    }
}
