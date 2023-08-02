package lv0; public class MultipleOfN {
    static class Solution{
        public int solution(int num, int n){
            if(num % n == 0){
                return 1;
            }else{
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(98,2));
    }
}
