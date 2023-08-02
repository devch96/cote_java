package lv0; public class OffZero {
    public static String solution(String n_str){
        return ""+Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        System.out.println(solution("0010"));
    }
}
