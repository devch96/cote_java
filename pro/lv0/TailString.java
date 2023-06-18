import java.util.Arrays;
import java.util.stream.Collectors;

public class TailString {
    public static String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        Arrays.stream(str_list).forEach(i -> {
            if (i.contains(ex)) {
                return;
            } else {
                answer.append(i);
            }
        });
        return answer.toString();
    }

    public static String solution2(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(i -> !i.contains(ex)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"abc","def","ghi"}, "ef"));
    }
}
