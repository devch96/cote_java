package lv0; public class FindString {
    public static int solution(String myString, String pat){
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("AbCdEfG","aBc"));
    }
}
