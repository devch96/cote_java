package lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Keypad {
    public static int[] solution(String[] keymap, String[] targets){
        int[] answer = new int[targets.length];
        Map<Character, Integer> charToKey = new HashMap<>();
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                if(!charToKey.containsKey(keymap[i].charAt(j))){
                    charToKey.put(keymap[i].charAt(j), j+1);
                }else{
                    charToKey.put(keymap[i].charAt(j), Math.min(charToKey.get(keymap[i].charAt(j)), j+1));
                }
            }
        }
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            int keyPress = 0;
            boolean flag =true;

            for (char c : target.toCharArray()) {
                if(!charToKey.containsKey(c)){
                    flag = false;
                }else{
                    keyPress+=charToKey.get(c);
                }
            }
            if(flag){
                answer[i] = keyPress;
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"ABACD","BCEFD"}, new String[] {"ABCD","AABB"})));
    }
}
