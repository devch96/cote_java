package lv0; public class IntegerPart {
    static class Solution{
        public int solution(double flo){
            int answer = (int) flo;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1.3));
    }
}
