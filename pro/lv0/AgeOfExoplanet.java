import java.util.HashMap;

public class AgeOfExoplanet {
    public String solution(int age){
        String answer = "";
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("0", "a");
        hashMap.put("1", "b");
        hashMap.put("2", "c");
        hashMap.put("3", "d");
        hashMap.put("4", "e");
        hashMap.put("5", "f");
        hashMap.put("6", "g");
        hashMap.put("7", "h");
        hashMap.put("8", "i");
        hashMap.put("9", "j");
        for(char ch : Integer.toString(age).toCharArray()){
            answer += hashMap.get(Character.toString(ch));
        }
        return answer;
    }
}
