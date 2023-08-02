

package lv0; public class CheckSubstring {
    public static int solution(String my_string, String target){
        return my_string.contains(target) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(CheckSubstring.solution("banana","wxyz"));
    }
}
