package lv1;

public class Three {
    public static int solution(int[] number){
        int count = 0;
        for(int i = 0; i < number.length-2; i++){
            for(int j = i+1; j < number.length-1; j++){
                for(int q = j+1; q < number.length; q++){
                    if(number[i] + number[j] + number[q] == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
