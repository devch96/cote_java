package lv1;

import java.util.HashMap;
import java.util.Map;

public class Mumble {
    public static int solution(String[] babbling){
        int answer = 0;
        String[] mumbles = {"aya","ye","woo","ma"};
        Map<String, String> mumble = new HashMap<>();
        mumble.put("aya","!");
        mumble.put("ye","@");
        mumble.put("woo","#");
        mumble.put("ma","$");
        for(int idx = 0; idx < babbling.length; idx++){
            for(int j = 0; j < 4; j++){
                babbling[idx] = babbling[idx].replace(mumbles[j],mumble.get(mumbles[j]));
            }
        }
        for(String s : babbling){
            if(!isSpecialCharactersOnly(s)){
                continue;
            }
            boolean flag = false;
            for(int i = 0 ; i < s.length()-1; i++){
                if (s.charAt(i) == s.charAt(i + 1)) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                answer++;
            }
        }
        return answer;
    }

    public static boolean isSpecialCharactersOnly(String str) {
        // 정규식 패턴: 특수문자로만 이루어진 문자열인지 검사
        String pattern = "^[\\p{Punct}]+$";
        return str.matches(pattern);
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
