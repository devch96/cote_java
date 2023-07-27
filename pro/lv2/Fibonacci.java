package lv2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static int solution(int n){
        List<Integer> dynamic = new ArrayList<>();
        dynamic.add(0);
        dynamic.add(1);
        for(int idx = 2; idx <= n; idx++){
            dynamic.add((dynamic.get(idx-2) + dynamic.get(idx-1))% 1234567);
        }
        return dynamic.get(n) % 1234567;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
