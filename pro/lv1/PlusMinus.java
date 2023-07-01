package lv1;

public class PlusMinus {
    public int solution(int[] absolutes, boolean[] signs){
        int answer = 0;
        for(int idx = 0; idx < absolutes.length; idx++){
            int sign = signs[idx] ? 1 : -1;
            answer += absolutes[idx] * sign;
        }
        return answer;
    }
}
