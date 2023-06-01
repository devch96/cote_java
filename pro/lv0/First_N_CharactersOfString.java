public class First_N_CharactersOfString {
    static class Solution {
        public String solution(String my_string, int n) {
            return my_string.substring(0,n);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ProgrammerS123", 11));
    }
}
