package lv0; public class NumberOfDice {
    public int solution(int[] box, int n){
        int answer = 1;
        for(int i : box){
            answer *= i/n;
        }
        return answer;
    }
}
