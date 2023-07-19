package lv1;


public class StringDevide {
    public static int solution(String s){
        int answer = 0;
        while(s.length() > 0){
            int x , y;
            x = y = 0;
            for(char c : s.toCharArray()){
                if(c == s.charAt(0)){
                    x++;
                }else{
                    y++;
                }
                if(x == y){
                    break;
                }
            }
            s = s.substring(x+y);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abracadabra"));
    }
}
