package lv2;

import java.util.*;

public class CircleList {
    public static int solution(int[] elements){
        Set<Integer> countSet = new HashSet<>();
        List<Integer> circleList = new ArrayList<>();
        for(int num : elements){
            circleList.add(num);
        }
        for(int i = 0; i < elements.length; i++){
            if(i != 0){
                circleList.add(circleList.get(i-1));
            }
            for (int j = 0; j < circleList.size()-i; j++) {
                countSet.add(circleList.subList(j, j + i + 1).stream().mapToInt(Integer::intValue).sum());
            }
        }
        return countSet.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {7,9,1,1,4}));
    }
}
