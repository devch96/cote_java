import java.util.Arrays;

public class MakeArray_5 {
    public static int[] solution(String[] intStrs, int k, int s, int l){
        return Arrays.stream(intStrs).filter(i -> Integer.parseInt(i.substring(s,s+l))>k).mapToInt(i -> Integer.parseInt(i.substring(s,s+l))).toArray();    }

    public static void main(String[] args) {
        System.out.println(solution());
    }
}
