public class CompareTwoNum {
    public static int solution(int a, int b){
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return Math.max(Integer.parseInt(s1+s2),2*a*b);
    }
}
