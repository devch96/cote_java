public class RepeatChar {
    public String solution(String my_string, int n){
        String answer = "";
        String[] temp = my_string.split("");
        for(int i = 0; i<my_string.length(); i++){
            answer += temp[i].repeat(n);
        }
        return answer;
    }
}
