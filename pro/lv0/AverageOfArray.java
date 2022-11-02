import java.util.Arrays;

public class AverageOfArray {
    public double solution(int[] numbers){
        double answer = 0;
        int total = 0;
        for(int i = 0 ; i<numbers.length; i++){
            total += numbers[i];
        }
        answer = total / numbers.length;
        return answer;
//        return Arrays.stream(numbers).average().orElse(0);

    }

}
