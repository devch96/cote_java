package lv0;
import java.util.Arrays;

public class SlicingArray {
    public int[] solution(int n, int[] slicer, int[] num_list){
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1) {
            return Arrays.copyOfRange(num_list, 0, b+1);
        } else if (n == 2) {
            return Arrays.copyOfRange(num_list,a,num_list.length);

        } else if (n == 3) {
            return Arrays.copyOfRange(num_list,a,b+1);

        }else {
            int[] answer = new int[((b-a)/c)+1];
            int index = 0;
            for(int i = a; i <= b ; i+=c){
                answer[index] = num_list[i];
                index++;
            }
            return answer;
        }
    }
}
