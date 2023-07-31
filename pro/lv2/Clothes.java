package lv2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clothes {
    public static int solution(String[][] clothes){
        Map<String, List<String>> count = new HashMap<>();
        for (String[] strArr : clothes) {
            List<String> cloth = count.getOrDefault(strArr[1], new ArrayList<>());
            cloth.add(strArr[0]);
            count.put(strArr[1], cloth);
        }
        int answer = 1;
        for (Map.Entry<String, List<String>> entry : count.entrySet()) {
            answer *= entry.getValue().size()+1;
        }
        return answer-1;
    }
}
