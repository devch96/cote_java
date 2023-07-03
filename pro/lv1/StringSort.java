package lv1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringSort {
    public static String solution(String s){
        Character[] cArr = s.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        Arrays.sort(cArr, Comparator.reverseOrder());
        String result = Arrays.stream(cArr).map(String::valueOf).collect(Collectors.joining());
        return result;

    }

    public static void main(String[] args) {
        System.out.println(solution("Zbcdefg"));
    }
}
