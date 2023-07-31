package lv2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Clustering {
    public static int solution(String str1, String str2) {
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        Map<String, Integer> map1 = getMultiSet(str1);
        Map<String, Integer> map2 = getMultiSet(str2);

        int intersection = 0;
        int union = 0;
        Set<String> keys = new HashSet<>();
        keys.addAll(map1.keySet());
        keys.addAll(map2.keySet());

        for (String key : keys) {
            if (map1.containsKey(key) && map2.containsKey(key)) {
                intersection += Math.min(map1.get(key), map2.get(key));
                union += Math.max(map1.get(key), map2.get(key));
            }else{
                union += Math.max(map1.getOrDefault(key,0),map2.getOrDefault(key,0));
            }
        }


        double similarity;
        if (union == 0) {
            similarity = 1;
        } else {
            similarity = (double) intersection / union;
        }

        return (int) (similarity * 65536);
    }

    private static Map<String, Integer> getMultiSet(String str) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length() - 1; i++) {
            char c1 = str.charAt(i);
            char c2 = str.charAt(i + 1);
            if (Character.isLetter(c1) && Character.isLetter(c2)) {
                String pair = c1 + "" + c2;
                map.put(pair, map.getOrDefault(pair, 0) + 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(solution("FRANCE","french"));
    }
}
