package lv0;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Make1 {
    public static int solution(int[] num_list){
        AtomicInteger answer=  new AtomicInteger(0);
        Arrays.stream(num_list).forEach(i -> {
            int count = 0;
            while(i != 1){
                if(i % 2 == 0){
                    i /= 2;
                } else{
                    i = (i-1) / 2;
                }
                count++;
            }
            answer.set(answer.get()+ count);
        });
        return answer.get();
    }
}
