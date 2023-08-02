package lv0;

import java.util.Arrays;

 public class ConvertSequence_3 {
    public static int[] solution(int[] arr, int k){
        return Arrays.stream(arr).map(k%2 == 0 ? i -> i+k : i -> i*k).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(ConvertSequence_3.solution(new int[] {1,2,3,100,99,98},3)));
    }
}
