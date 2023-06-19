import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConcatString {
    public static String solution(String[] my_strings, int[][] parts){
        return IntStream.range(0, my_strings.length).mapToObj(i -> my_strings[i].substring(parts[i][0],parts[i][1]+1)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}
