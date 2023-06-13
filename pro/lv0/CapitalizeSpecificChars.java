public class CapitalizeSpecificChars {
    public static String solution(String my_string, String alp){
        return my_string.replaceAll(alp,alp.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(solution("programmers","p"));
    }
}
