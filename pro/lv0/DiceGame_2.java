package lv0;
import java.util.HashSet;
import java.util.Set;

 public class DiceGame_2 {
    public int solution(int a, int b, int c){
        Set<Integer> intSet =new HashSet<>();
        intSet.add(a);
        intSet.add(b);
        intSet.add(c);
        if(intSet.size() == 1){
            return (a+b+c)*(a*a + b*b + c*c)*(a*a*a + b*b*b + c*c*c);
        } else if (intSet.size() ==2) {
            return (a+b+c) * (a*a + b*b +c*c);
        } else{
            return a+b+c;
        }
    }
}
