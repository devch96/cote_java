import java.util.Arrays;

public class CompareArray {
    public int solution(int[] array, int height){
        int answer = 0;
        for(int num : array){
            if(num > height){
                answer++;
            }
        }
        return answer;
//        return (int) Arrays.stream(array).filter(value -> value > height).count();
    }
}
