package lv0; public class ReplaceIndex {
    public String solution(String my_string, int num1, int num2){
        char idx1 = my_string.charAt(num1);
        char idx2 = my_string.charAt(num2);
        StringBuilder answer = new StringBuilder(my_string);
        answer.setCharAt(num1, idx2);
        answer.setCharAt(num2, idx1);
        return answer.toString();
    }
}
