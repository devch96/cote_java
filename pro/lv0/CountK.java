

package lv0; public class CountK {
    public int solution(int i, int j, int k){
        int answer = 0;
        for(int x = i; x<=j ; x++){
            answer += String.valueOf(x).chars().filter(c -> c == (char) (k + '0')).count();
        }
        return answer;
    }
}
