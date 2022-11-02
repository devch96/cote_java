import java.util.Arrays;
import java.util.Collections;

public class CountArray {
    public int solution(int[] array, int n){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(n == array[i]){
                count += 1;
            }
        }
        return count;
//        for(int num : array) {
//            if ( num == n) count++;
//        }
//        return Collections.frequency(Arrays.asList(array),n);
    }
}
