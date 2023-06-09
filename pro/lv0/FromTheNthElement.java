import java.util.Arrays;

public class FromTheNthElement {
    public static int[] solution(int[] num_list, int n){
        return Arrays.copyOfRange(num_list,n-1,num_list.length);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(FromTheNthElement.solution(new int[] {2,1,6}, 3)));
    }
}
