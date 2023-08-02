package lv0; public class RockPaperScissors {
    public String solution(String rsp){
        String answer = "";
        for(char ch : rsp.toCharArray()){
            if(ch == '2'){
                answer += '0';
            } else if (ch == '5') {
                answer += '2';
            }else answer += '5';
        }
        return answer;
    }
}
