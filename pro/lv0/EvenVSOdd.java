import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class EvenVSOdd {
    public static int solution(int[] num_list){
        AtomicInteger even = new AtomicInteger(0);
        AtomicInteger odd = new AtomicInteger(0);
        IntStream.range(0,num_list.length).forEach(i -> {
            if((i+1) % 2 == 0){
                even.addAndGet(num_list[i]);
            }else {
                odd.addAndGet(num_list[i]);
            }
        });
        return Math.max(even.get(), odd.get());
    }
}
