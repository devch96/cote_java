package lv0;
import java.util.Arrays;

public class NumberConcat {
    public static int solution(int[] num_list){
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();
        Arrays.stream(num_list).forEach(n -> {
            if(n % 2 == 0){
                even.append(n);
            }else{
                odd.append(n);
            }
        });
        return Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 4, 5, 2, 1}));
    }
}
