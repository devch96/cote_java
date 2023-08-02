package lv0;
import java.util.stream.IntStream;

 public class SubstringEndsWith {
    public static String solution(String myString, String pat){
        return myString.substring(0,IntStream.rangeClosed(0, myString.length())
                .filter(i -> myString.substring(0, i).endsWith(pat))
                .reduce((a,b) -> b).getAsInt());

//        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG","dE"));

    }
}
