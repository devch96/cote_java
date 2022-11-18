public class Factorial {
    public int solution(int n){
        int answer = 1;
        int temp = 1;
        while(answer < n){
            temp++;
            answer *= temp;
        }
        if(answer == n){
            return temp;
        } else{
            return temp-1;
        }
    }
}
