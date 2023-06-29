import java.util.Arrays;
import java.util.stream.IntStream;

public class MakeArray_2 {
    public static int[] solution(int l, int r){
        int[] answer = IntStream.rangeClosed(l,r).filter(i -> String.valueOf(i).equals(String.valueOf(i).replaceAll("[1-4]|[6-9]",""))).toArray();
        return answer.length > 0 ? answer : new int[] {-1} ;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(10,20)));
    }
}
