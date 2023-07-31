package lv2;

import java.util.Arrays;

public class MultipleLCM {
    public static int solution(int[] arr){
        int multipleLcm = 1;
        for(int idx = 0; idx < arr.length; idx++){
            multipleLcm = lcm(multipleLcm, arr[idx]);
        }
        return multipleLcm;
    }

    public static int gcd(int n,int m){
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

    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,6,8,14}));
    }
}
