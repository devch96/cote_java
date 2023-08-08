package lv2;

import java.util.*;
import java.util.stream.IntStream;

public class Bridge {
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int now = 0, sec = 1;
        for (int w : truck_weights) {
            if (!map.isEmpty() && map.firstKey() == sec) {
                now -= map.remove(map.firstKey());
            }
            while (w + now > weight) {
                sec = map.firstKey();
                now -= map.remove(map.firstKey());
            }

            map.put(sec + bridge_length, w);
            now += w;
            sec++;
        }
        return map.lastKey();
    }

    public static void main(String[] args) {
        System.out.println(solution(2,10,new int[] {7,4,5,6}));
    }
}
