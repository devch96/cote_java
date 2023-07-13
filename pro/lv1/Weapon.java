package lv1;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    public static int solution(int number, int limit, int power){
        int answer = 0;
        for(int i = 1; i <= number; i++){
            if(measureCnt(i) > limit){
                answer +=power;
            }else{
                answer+=measureCnt(i);
            }
        }
        return answer;
    }

    public static int measureCnt(int num){
        List<Integer> measure = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(num != Math.pow(i,2)){
                    measure.add(i);
                }
                measure.add(num/i);
            }
        }
        return measure.size();
    }

    public static void main(String[] args) {
        System.out.println(solution(10,3,2));
    }
}
