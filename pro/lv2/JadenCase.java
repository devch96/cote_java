package lv2;

import java.util.Locale;

public class JadenCase {
    public static String solution(String s){
        StringBuilder sb = new StringBuilder();
        boolean isFirstChar = true;

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                if (isFirstChar) {
                    sb.append(Character.toUpperCase(c));
                    isFirstChar = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else {
                sb.append(c);
                isFirstChar = true;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(" o Un  FoLo  w   me"));
    }
}
