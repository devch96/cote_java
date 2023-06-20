import java.util.Arrays;
import java.util.stream.IntStream;

public class SuffixArray {
    public static String[] solution(String my_string){
        return Arrays.stream(IntStream.range(0,my_string.length()).mapToObj(i -> my_string.substring(i)).toArray()).sorted().toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("banana")));
    }
}
