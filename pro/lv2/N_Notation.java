package lv2;

public class N_Notation {
    public int solution(int n, int k) {
        int answer = 0;
        String[] change = changeNotation(n,k).split("0+");
        for(String s : change){
            if(isPrime(Long.parseLong(s))){
                answer++;
            }
        }
        return answer;
    }

    public String changeNotation(int n, int c){
        StringBuilder sb = new StringBuilder();
        int current = n;
        while(current > 0){
            sb.append(current % c);
            current /= c;
        }
        return sb.reverse().toString();
    }

    public boolean isPrime(long n){
        if(n < 2){
            return false;
        }else if(n == 2){
            return true;
        }else{
            for(long i = 2; i <= Math.sqrt(n); i++){
                if(n%i == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        N_Notation s = new N_Notation();
        System.out.println(s.solution(1100011,10));
    }
}
