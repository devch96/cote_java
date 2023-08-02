package lv0;
import java.util.Arrays;

 public class MakeBOutofA {
    public int solution(String before, String after){
        char[] charsB = before.toCharArray();
        char[] charsA = after.toCharArray();
        Arrays.sort(charsB);
        Arrays.sort(charsA);
        String sortedB = new String(charsB);
        String sortedA = new String(charsA);
        if(sortedB.equals(sortedA)){
            return 1;
        }else{
            return 0;
        }
    }
}
