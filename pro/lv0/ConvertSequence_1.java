import java.util.Arrays;

public class ConvertSequence_1 {
    public static int[] solution(int[] arr){
        return Arrays.stream(arr).map(value -> {
            if(value >= 50 && value % 2 == 0){
                return value / 2;
            } else if(value < 50 && value % 2 != 0) {
                return value * 2;
            } else{
                return value;
            }
        }).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 100, 99, 98})));
    }
}
