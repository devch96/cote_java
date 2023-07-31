package lv2;

import java.util.*;

public class Tuple {
    public static int[] solution(String s){
        String[] subArrays = s.substring(0,s.length()-2).replace("{","").replaceAll("," ," ").split("}");
        List<String[]> subList = new ArrayList<>();
        for (int idx = 0; idx < subArrays.length; idx++) {
            subList.add(subArrays[idx].trim().split(" "));
        }
        subList.sort(Comparator.comparing(array -> array.length));
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < subList.size(); i++){
            for(String num : subList.get(i)){
                if(!answer.contains(Integer.parseInt(num))){
                    answer.add(Integer.parseInt(num));
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));
    }
}
