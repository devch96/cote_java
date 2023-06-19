import java.util.Arrays;

public class RemoveAD {
    public static String[] solution(String[] strArr){
        return Arrays.stream(strArr).filter(i -> !i.contains("ad")).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"and","notad","abcd"})));
    }
}
