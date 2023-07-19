package lv1;

import java.util.*;

public class Marathon {
    public static String solution(String[] participant, String[] completion){
        Map<String, Integer> participants = new HashMap<>();
        for(String s : participant){
            if(participants.containsKey(s)){
                participants.put(s,participants.get(s)+1);
            }else{
                participants.put(s,0);
            }
        }
        for(String s : completion){
            if(participants.get(s) == 0){
                participants.remove(s);
            }else{
                participants.put(s, participants.get(s)-1);
            }
        }
        String s = new String(new ArrayList<>(participants.keySet()).get(0));
        return s;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"leo", "kiki", "eden"}, new String[] {"kiki", "eden"}));
    }
}
