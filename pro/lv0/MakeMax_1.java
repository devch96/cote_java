import java.util.Arrays;
import java.util.Stack;

public class MakeMax_1 {
    public int solution(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
