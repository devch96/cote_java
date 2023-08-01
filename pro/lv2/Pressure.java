package lv2;

import java.util.*;

public class Pressure {
    public static int[] solution(String msg){
        Map<String, Integer> dictionary = new HashMap<>();
        for(int lastIndex =  1; lastIndex < 27; lastIndex++){
            dictionary.put(String.valueOf((char) (64 + lastIndex)), lastIndex);
        }
        int lastIndex = 27;
        List<Integer> answer = new ArrayList<>();
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : msg.toCharArray()) {
            deque.add(c);
        }
        StringBuilder temp = new StringBuilder();
        while (!deque.isEmpty()) {
            temp.append(deque.pollFirst());
            if (!deque.isEmpty()) {
                if (!dictionary.containsKey(temp.toString().concat(String.valueOf(deque.peekFirst())))) {
                    dictionary.put(temp.toString().concat(String.valueOf(deque.peekFirst())), lastIndex);
                    lastIndex += 1;
                    answer.add(dictionary.get(temp.toString()));
                    temp = new StringBuilder();
                }
            }
        }
        answer.add(dictionary.get(temp.toString()));
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("KAKAO")));
    }
}
