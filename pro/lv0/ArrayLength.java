import java.util.Arrays;

public class ArrayLength {
    public static int[] solution(int[] arr){
        if(Integer.toBinaryString(arr.length).replaceAll("1","").length() == Integer.toBinaryString(arr.length).length()-1){
            return arr;
        }else{
            int[] answer = new int[(int) Math.pow(2,Integer.toBinaryString(arr.length).length())];
            System.arraycopy(arr,0,answer,0,arr.length);
            Arrays.fill(answer,arr.length,answer.length,0);
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 4, 5, 6})));
    }
}
