package lv0; public class MulString {
    public static String solution(String my_string, int k){
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i<k; i++){
            answer.append(my_string);
        }
        return answer.toString();
//      return my_string.repeat(k);
    }
}
