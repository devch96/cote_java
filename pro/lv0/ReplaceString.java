package lv0; public class ReplaceString {
    public String solution(String my_string, String letter){
        my_string = my_string.replace(letter, "");
        return my_string;
//        String answer = "";
//        char c = letter.charAt(0);
//        for (int i = 0; i < my_string.length(); i++) {
//            char temp = my_string.charAt(i);
//            if (temp == c) {
//                continue;
//            }
//            answer += temp;
//        }
//        return answer;
    }
}
