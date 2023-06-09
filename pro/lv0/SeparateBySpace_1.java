public class SeparateBySpace_1 {
    public static String[] solution(String my_string){
        return my_string.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(String.join(" ",SeparateBySpace_1.solution("i love you")));
    }
}
