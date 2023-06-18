public class PlusMoreThanBigger {
    public static int solution(int a, int b){
        String s1 = new String(String.valueOf(a) + String.valueOf(b));
        String s2 = new String(String.valueOf(b) + String.valueOf(a));
        return s1.compareTo(s2) >= 0 ? Integer.parseInt(s1) : Integer.parseInt(s2);
    }

    public static void main(String[] args) {
        System.out.println(solution(89,8));
    }
}
