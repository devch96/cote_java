import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ManipulateTheNumber_1 {
    public static int solution(int n, String control){
//        return control.chars().reduce(n, (acc,c) -> acc + (c == 'w' ? 1 : c == 's' ? -1 : c == 'd' ? 10: -10));
        for(char c : control.toCharArray()){
            if(c == 'w'){
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else {
                n -= 10;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(ManipulateTheNumber_1.solution(0,"wsdawsdassw"));
    }
}
