package lv1;

public class GCDLCM {
    public static int[] solution(int n, int m){
        int[] gcdlcm = new int[2];
        gcdlcm[0] = gcd(n,m);
        gcdlcm[1] = lcm(n,m);
        return gcdlcm;
    }

    public static int gcd(int n, int m){
        int x = Math.max(n,m);
        int y = Math.min(n,m);
        int r = 0;

        while(y != 0){
            r = x%y;
            x = y;
            y = r;
        }
        return x;
    }

    public static int lcm(int n, int m){
        return n*m / gcd(n,m);
    }


}
