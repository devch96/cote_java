package lv0; public class FindCompositeNum {
    public int solution(int n){
        int primeNum = 0;
        for(int i = 1; i <= n ; i ++){
            if(isPrime(i)){
                primeNum++;
            }
        }
        return n-primeNum-1;
    }
    public boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 2; i<=((int)(Math.sqrt(n))); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
