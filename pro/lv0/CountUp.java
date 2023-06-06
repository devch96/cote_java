import java.util.Arrays;

public class CountUp {
    public int[] solution(int start, int end){
       int[] answer = new int[end-start+1];
       for(int i = 0; i<answer.length; i++){
           answer[i] = start++;
       }
       return answer;
       /*
       return IntStream.rangeClosed(start,end).toArray();
       */
    }

    public static void main(String[] args) {
        CountUp countUp = new CountUp();
        System.out.println(Arrays.toString(countUp.solution(3,10)));
    }
}
