
package lv0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BindString {
    public static int solution(String[] strArr){
        int[] lenArr = Arrays.stream(strArr).mapToInt(i->i.length()).toArray();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int len : lenArr){
            frequencyMap.put(len, frequencyMap.getOrDefault(len,0) + 1);
        }
        int maxFrequency = 0;
        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){
            int frequency = entry.getValue();
            if(frequency > maxFrequency){
                maxFrequency = frequency;
            }
        }
        return maxFrequency;
    }
}
