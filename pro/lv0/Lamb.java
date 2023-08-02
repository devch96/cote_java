package lv0; public class Lamb {
    public int solution(int n, int k){
        int quot = n / 10;
        return (12000*n) + (2000*(k-quot));
    }
}
