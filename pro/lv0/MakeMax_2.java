package lv0;
import java.util.Arrays;

public class MakeMax_2 {
    public int solution(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0] * numbers[1] > numbers[numbers.length] * numbers[numbers.length-1] ?
                numbers[0] * numbers[1] : numbers[numbers.length] * numbers[numbers.length-1];
    }
}
