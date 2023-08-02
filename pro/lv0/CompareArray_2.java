package lv0;

import java.util.Arrays;

public class CompareArray_2 {
    public static int solution(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            return arr1.length > arr2.length ? 1 : -1;
        }else {
            if(Arrays.stream(arr1).sum() == Arrays.stream(arr2).sum()){
                return 0;
            }
            return Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum() ? 1 : -1;
        }
    }
}
