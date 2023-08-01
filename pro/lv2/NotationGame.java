package lv2;

public class NotationGame {
    public static String solution(int n, int t, int m, int p){
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(sb.length() < t*m){
            sb.append(Integer.toString(i,n));
            i++;
        }
        StringBuilder answer = new StringBuilder();
        i = p-1;
        while(answer.length() < t){
            answer.append(sb.charAt(i));
            i += m;
        }
        return answer.toString().toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(solution(16,16,2,1));
    }
}
