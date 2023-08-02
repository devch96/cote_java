
package lv0; public class AddHiddenNum_1 {
    public int solution(String my_string){
        int answer = 0;
        for(char ch : my_string.toCharArray()){
            if (Character.isDigit(ch)){
                answer += (int) (ch-'0');
            }
        }
        return answer;
    }
}
