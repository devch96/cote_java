package lv2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DiscountEvent {
    public static int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantCount = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            wantCount.put(want[i], number[i]);
        }
        for(int i = 0; i < discount.length - 9; i++){
            Map<String, Integer> count = countMap(Arrays.copyOfRange(discount, i, i+10));
            if (compareMaps(wantCount, count)) {
                answer++;
            }
        }
        return answer;
    }
    public static Map<String, Integer> countMap(String[] strArr){
        Map<String, Integer> result = new HashMap<>();
        for (String str : strArr) {
            result.put(str, result.getOrDefault(str,0)+1);
        }
        return result;
    }

    public static <K, V> boolean compareMaps(Map<K, V> map1, Map<K, V> map2) {
        if (map1.size() != map2.size()) {
            return false;
        }

        for (Map.Entry<K, V> entry : map1.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            if (!map2.containsKey(key) || !map2.get(key).equals(value)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1}, new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}
