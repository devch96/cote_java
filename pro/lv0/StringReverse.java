public class StringReverse {
    public String solution(String my_string){
        String answer = "";
        for(int i = my_string.length()-1; i > -1; i--){
            answer += my_string.charAt(i);
        }
//        StringBuilder sb = new StringBuilder();
//        sb.append(my_string);
//        sb.reverse();
//        return sb.toString();
        return answer;
    }
}
