package lv1;

public class SkipCode {
    public static String solution(String s, String skip, int index){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder regex = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for (char c : skip.toCharArray()) {
            regex.append(c+"|");
        }
        String loop = alphabet.replaceAll("([" + regex.substring(0,regex.length()-1) + "])","");
        for (int idx = 0; idx < s.length(); idx++) {
            answer.append(loop.charAt((loop.indexOf(s.charAt(idx)) + index) % loop.length()));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("aukks","wbqd",5));
    }
}
