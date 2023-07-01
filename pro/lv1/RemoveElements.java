package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveElements {
    public int[] solution(int[] arr){
        if(arr.length == 1){
            return new int[] {-1};
        }else{
            List<Integer> list = new ArrayList<>();
            for(int n : arr){
                list.add(n);
            }
            list.remove(Collections.min(list));
            return list.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}
