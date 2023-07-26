package lv1;

import java.util.Arrays;

public class Burger {
    public static int solution(int[] ingredient){
        StringBuilder s = new StringBuilder();
        int answer = 0;
        for(int i : ingredient){
            s.append(i);
            if(s.length() > 3 && s.subSequence(s.length()-4, s.length()).equals("1231")){
                answer++;
                s.delete(s.length()-4, s.length());
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
}
