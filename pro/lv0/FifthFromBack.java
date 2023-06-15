import java.util.Arrays;

public class FifthFromBack {
    public static int[] solution(int[] num_list){
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list,5,num_list.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));
    }
}
