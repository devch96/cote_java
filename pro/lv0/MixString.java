package lv0;
import java.util.stream.IntStream;

public class MixString {
    public static String solution(String str1, String str2){
        return String.join("",IntStream.range(0,str1.length()).mapToObj(i -> String.valueOf(str1.charAt(i)).concat(String.valueOf(str2.charAt(i)))).toArray(String[]::new));
    }

    public static void main(String[] args) {
        System.out.println(solution("aaaaa","bbbbb"));
    }
}
