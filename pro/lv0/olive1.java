import java.util.HashMap;

public class olive1 {
    public int solution(String number){
        int answer = 0;
        for(int idx = 0; idx < number.length(); idx++){
            if(number.charAt(idx) == '0'){
                answer++;
            }else{
                if(idx == number.length()-1){
                    answer += 2;
                }else{
                    if(((number.charAt(idx) - '0')+1) == (number.charAt(idx+1) - '0')){
                        idx++;
                        answer++;
                    }
                    else{
                        answer+=2;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        olive1 olive1 = new olive1();
        System.out.println(olive1.solution("12156"));
        System.out.println(olive1.solution("321"));
        System.out.println(olive1.solution("1234567"));
        System.out.println(olive1.solution("100"));

    }
}
