import java.util.stream.IntStream;

public class FirstNegativeNumber {
    public static int solution(int[] num_list){
        int answer = -1;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0){
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(FirstNegativeNumber.solution(new int[] {12,4,15,46,39,-2,15}));
    }
}
