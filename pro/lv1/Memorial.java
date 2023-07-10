package lv1;

import java.util.HashMap;
import java.util.Map;

public class Memorial {
    public int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] answer = new int[photo.length];
        Map<String, Integer> score = new HashMap<>();
        for(int i = 0; i < name.length; i++){
            score.put(name[i], yearning[i]);
        }
        for(int idx = 0; idx < photo.length; idx++){
            int totalScore = 0;
            for(String person : photo[idx]){
                totalScore += score.getOrDefault(person, 0);
            }
            answer[idx] = totalScore;
        }
        return answer;
    }
}
