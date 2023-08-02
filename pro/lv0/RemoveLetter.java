package lv0;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveLetter {
    public static String solution(String my_string, int[] indices){
        StringBuilder sb = new StringBuilder(my_string);
        Arrays.sort(indices);
        int offset = 0;

        for (int i : indices) {
            int adjustedIndex = i - offset;
            sb.deleteCharAt(adjustedIndex);
            offset++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[] {1, 16, 6, 15, 0, 10, 11, 3}));
    }
}
