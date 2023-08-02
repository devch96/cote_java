package lv0;
import java.util.Arrays;

public class DeleteElement {
    public static int[] solution(int[] arr, int[] delete_list){
        return Arrays.stream(arr).filter(i -> !Arrays.asList(Arrays.stream(delete_list).boxed().toArray(Integer[]::new)).contains(i)).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {293, 1000, 395, 678, 94}, new int[] {94, 777, 104, 1000, 1, 12})));
    }
}
