import java.util.Arrays;

public class SortString_2 {
    public String solution(String my_string){
        String answer = "";
        for(char ch : my_string.toCharArray()){
            if(Character.isUpperCase(ch)){
                answer += Character.toLowerCase(ch);
                continue;
            }
            answer += ch;
        }
        char[] chars = answer.toCharArray();
        Arrays.sort(chars);
        answer = new String(chars);
        return answer;

//        char[] c = my_string.toLowerCase().toCharArray();
//        Arrays.sort(c);
//        return new String(c);
    }
}
