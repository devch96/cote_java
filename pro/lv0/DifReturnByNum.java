package lv0;
import java.util.stream.IntStream;

public class DifReturnByNum {
    public static int solution(int n) {
        if(n%2 == 0){
            return IntStream.rangeClosed(1,n).filter(i -> i%2 == 0).reduce(0, (acc,operand) -> acc+(operand*operand));
        } else{
            return IntStream.rangeClosed(1,n).filter(i -> i%2 != 0).reduce(0, (acc,operand) -> acc + operand);
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
