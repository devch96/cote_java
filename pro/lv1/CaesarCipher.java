package lv1;

public class CaesarCipher {
    public static String solution(String s, int n){
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isLowerCase(c)) {
                // 소문자인 경우
                c = (char) ((c - 'a' + n) % 26 + 'a');
            } else if (Character.isUpperCase(c)) {
                // 대문자인 경우
                c = (char) ((c - 'A' + n) % 26 + 'A');
            }

            answer.append(c);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
