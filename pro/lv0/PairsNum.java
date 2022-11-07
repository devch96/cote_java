public class PairsNum {
    public int solution(int n){
        int answer = 0;
        for(int i = 1 ; i < ((int) Math.sqrt(n))+1; i++){
            if(n%i == 0){
                answer++;
            }
        }
        return Math.sqrt(n) % 1 == 0 ? (answer * 2) - 1 : answer * 2;
    }
}
