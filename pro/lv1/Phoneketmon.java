package lv1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Phoneketmon {
    public int solution(int[] nums){
        Set<Integer> set = new HashSet<>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        if(nums.length/2 <= set.size()){
            return nums.length/2;
        }else{
            return set.size();
        }
    }
}
