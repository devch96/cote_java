public class CheckIfPrefix {
    public static int solution(String my_string, String is_prefix){
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(CheckIfPrefix.solution("banana","nan"));
    }
}
