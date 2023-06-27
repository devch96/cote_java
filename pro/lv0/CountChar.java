import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static int[] solution(String my_string){
        Map<Character, Integer> count = new HashMap<>();
        for(int i = 65; i < 123; i++){
            if(i >= 91 && i <= 96){
                continue;
            }
            count.put((char) i,0);
            for(char c : my_string.toCharArray()){
                if ((char) i == c){
                    count.put((char) i, count.get((char)i)+1);
                }
            }
        }
        return count.values().stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("Programmers")));
    }
}
