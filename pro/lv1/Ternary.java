package lv1;

public class Ternary {
    public static int solution(int n){
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            sb.append(n%3);
            n /= 3;
        }
        int pivot = 0;
        int answer = 0;
        for(int idx = sb.length()-1; idx >= 0; idx--){
            answer += (sb.charAt(idx) -'0')* Math.pow(3,pivot);
            pivot++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(45));
    }

}
