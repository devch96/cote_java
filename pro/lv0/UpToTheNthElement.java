import java.util.Arrays;

public class UpToTheNthElement {
    public int[] solution(int[] num_list, int n){
        return Arrays.copyOfRange(num_list,0,n);
    }

    public static void main(String[] args) {
        UpToTheNthElement upToTheNthElement = new UpToTheNthElement();
        System.out.println(Arrays.toString(upToTheNthElement.solution(new int[] {5,2,1,7,5},3)));
    }
}
