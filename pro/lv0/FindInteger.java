import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class FindInteger {
    public int solution(int[] num_list, int n){
        for(int i : num_list){
            if(i == n){
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        FindInteger findInteger = new FindInteger();
        System.out.println(findInteger.solution(new int[] {1,2,3,4,5},3));
    }
}
