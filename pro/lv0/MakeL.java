import java.util.Arrays;

public class MakeL {
    public static String solution(String myString){
        StringBuilder answer = new StringBuilder();
        for(char c : myString.toCharArray()){
            if(c < 'l'){
                answer.append('l');
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
//        return myString.replaceAll("[^l-z]", "l");
    }
}
