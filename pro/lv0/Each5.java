package lv0;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Each5 {
    public static String[] solution(String[] names){
        return IntStream.range(0, names.length).filter(i -> i%5 == 0).mapToObj(i -> names[i]).toArray(String[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }
}
