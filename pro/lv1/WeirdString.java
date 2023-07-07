package lv1;

public class WeirdString {
    public static String solution(String s){
        s = s.toLowerCase();

        String[] chars = s.split("");

        boolean upper = true;
        StringBuilder builder = new StringBuilder();

        for (String c : chars) {
            if (upper) {
                builder.append(c.toUpperCase());
            } else {
                builder.append(c);
            }

            upper = !upper;
            if (c.equals(" ")) {
                upper = true;
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }
}
