public class RemoveDuplicateCharacters {
    public String solution(String my_string) {
        String answer = "";
        for(char ch : my_string.toCharArray()){
            if(!answer.contains(String.valueOf(ch))){
                answer+=ch;
            }
        }
        return answer;
    }
}
