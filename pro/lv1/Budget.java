package lv1;

import java.util.Arrays;

public class Budget {
    public static int solution(int[] d, int budget){
        Arrays.sort(d);
        int count = 0;
        for(int i : d){
            if(budget - i < 0){
                return count;
            }else{
                budget -= i;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,3,2,5,4}, 9));
    }
}
