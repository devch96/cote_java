package lv0;
import java.util.Arrays;
import java.util.stream.Collectors;

public class VerticalReading {
    public static String solution(String my_string, int m, int c){
        return Arrays.stream(my_string.split(String.format("(?<=\\G.{%d})",m))).map(i -> String.valueOf(i.charAt(c-1))).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc",4,2));
    }
}
