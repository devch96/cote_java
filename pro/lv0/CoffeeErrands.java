import java.util.stream.IntStream;

public class CoffeeErrands {
    public static int solution(String[] order){
        return IntStream.range(0, order.length).map(i -> {
            if(order[i].contains("americano")){
                return 4500;
            } else if (order[i].contains("latte")) {
                return 5000;
            } else{
                return 4500;
            }
        }).sum();
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[] {"cafelatte", "americanoice", "hotcafelatte", "anything"}));
    }
}
