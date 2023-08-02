package lv0;
import java.util.Arrays;

public class Median {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
