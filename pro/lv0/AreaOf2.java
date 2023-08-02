

import java.util.Arrays;
import java.util.stream.IntStream;

package lv0; public class AreaOf2 {
    public static int[] solution(int[] arr){
        int[] arr2 = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).toArray();
        return arr2.length != 0 ? Arrays.copyOfRange(arr, arr2[0], arr2[arr2.length-1]+1) : new int[] {-1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 1, 4, 5, 2, 9})));
    }
}
