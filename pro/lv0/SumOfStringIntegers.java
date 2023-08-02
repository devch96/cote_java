package lv0; public class SumOfStringIntegers {
    public static int solution(String num_str){
//        return num_str.chars().map(c -> c-48).sum();
        return num_str.chars().reduce(0, (acc,c) -> c - '0' + acc);
    }

    public static void main(String[] args) {
        System.out.println(SumOfStringIntegers.solution("123456789"));
    }
}
