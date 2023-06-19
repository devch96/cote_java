import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class NumBtwX {
    public static int[] solution(String myString){
        return Arrays.stream(myString.split("x", -1)).mapToInt(String::length).toArray();
    }
}
