package lv1;

public class MiddleLetter {
    public static String solution(String s){
        int len = s.length();
        if(len%2 == 0){
            return s.charAt(len/2-1)+""+s.charAt(len/2);
        }else{
            return s.charAt(len/2)+"";
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("abcde"));
    }
}
