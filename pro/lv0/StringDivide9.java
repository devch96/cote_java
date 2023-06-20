import java.util.Arrays;
import java.util.stream.IntStream;

public class StringDivide9 {
    public static int solution(String number){
        return IntStream.range(0,number.length()).map(i -> number.charAt(i) - '0').sum() % 9;
    }

    public static void main(String[] args) {
        System.out.println(solution("78720646226947352489"));
    }
}
