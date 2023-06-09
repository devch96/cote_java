import java.util.Arrays;

public class LastTwoElements {
    public static int[] solution(int[] num_list){
        int[] answer = new int[num_list.length+1];
        System.arraycopy(num_list,0,answer,0,num_list.length);
        int result = num_list[num_list.length-1] > num_list[num_list.length-2] ? num_list[num_list.length-1] - num_list[num_list.length-2] : num_list[num_list.length-1]*2;
        answer[num_list.length] = result;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(LastTwoElements.solution(new int[] {2,1,6})));
    }
}
