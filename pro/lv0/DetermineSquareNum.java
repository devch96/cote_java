package lv0; public class DetermineSquareNum {
    public int solution(int n){
        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
