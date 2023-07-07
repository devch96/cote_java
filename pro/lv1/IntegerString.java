package lv1;

import java.util.Arrays;

public class IntegerString {
    public static int solution(String s){
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i =0; i < numbers.length; i++){
            s = s.replace(numbers[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("one4seveneighteight"));
    }
}
