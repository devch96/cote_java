package lv1;

import java.util.HashMap;
import java.util.Map;

public class Survey {
    public static String solution(String[] survey, int[] choices){
        Map<Character, Integer> score = new HashMap<>();
        for(int idx = 0 ; idx < survey.length; idx++){
            if(choices[idx] > 4){
                score.put(survey[idx].charAt(1), score.getOrDefault(survey[idx].charAt(1),0) + choices[idx]-4);
            }else if(choices[idx] < 4){
                score.put(survey[idx].charAt(0), score.getOrDefault(survey[idx].charAt(0),0) + 4 - choices[idx]);
            }
        }
        StringBuilder answer = new StringBuilder();
        char rt = score.getOrDefault('R',0) >= score.getOrDefault('T',0) ? 'R' : 'T';
        char cf = score.getOrDefault('C',0) >= score.getOrDefault('F',0) ? 'C' : 'F';
        char jm = score.getOrDefault('J',0) >= score.getOrDefault('M',0) ? 'J' : 'M';
        char an = score.getOrDefault('A',0) >= score.getOrDefault('N',0) ? 'A' : 'N';
        answer.append(rt);
        answer.append(cf);
        answer.append(jm);
        answer.append(an);
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"AN", "CF", "MJ", "RT", "NA"}, new int[] {5, 3, 2, 7, 5}));
    }
}
