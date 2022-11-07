import java.util.Arrays;

public class SortString_1 {
    public int[] solution(String my_string){
        String str = my_string.replaceAll("\\D","");
        int[] answer = new int[str.length()];
        for(int i = 0; i < str.length(); i++){
            answer[i] = (int)str.charAt(i) -'0';
        }
        Arrays.sort(answer);
        return answer;
    }
}
