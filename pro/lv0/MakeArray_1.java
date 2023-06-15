import java.util.Arrays;

public class MakeArray_1 {
    public static int[] solution(int n, int k){
        int[] answer = new int[Math.floorDiv(n,k)];
        for(int i = 0; i < answer.length; i++){
            answer[i] = k*(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(15,5)));
    }
}
