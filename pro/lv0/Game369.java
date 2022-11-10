public class Game369 {
    public int solution(int order){
        int answer = 0;
        for(char ch : Integer.toString(order).toCharArray()){
            if(ch == '3' || ch == '6' || ch == '9'){
                answer++;
            }
        }
        return answer;
    }
}
