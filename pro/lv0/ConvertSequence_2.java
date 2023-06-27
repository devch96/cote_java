import java.util.Arrays;

public class ConvertSequence_2 {
    public static int solution(int[] arr){
        int x = 0;
        while(true){
            int[] arr1 = Arrays.stream(arr).map(i -> {
                if(i >= 50 && i%2 == 0){
                    return i / 2;
            } else if (i < 50 && i % 2 != 0){
                    return i*2 +1;
                }else {
                    return i;
                }
            }).toArray();
            if(Arrays.equals(arr, arr1)){
                return x;
            }
            x++;
            arr = arr1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 100, 99, 98}));
    }
}
