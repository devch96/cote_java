package lv0;
import java.util.Arrays;
import java.util.HashMap;

public class MorseCode_1 {
    public String solution(String letter){
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] letterArray = letter.split(" ");
        HashMap<String, Character> hashMap = new HashMap<String, Character>();
        for(int i = 0 ; i < morse.length; i++){
            hashMap.put(morse[i], (char)(97 + i));
        }
        for(int i = 0; i < letterArray.length; i++){
            answer += hashMap.get(letterArray[i]);
        }
        return answer;
    }
}
