public class SuffixCheck {
    public static int solution(String my_string, String is_suffix){
        return my_string.endsWith(is_suffix) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana","ana"));
    }
}
