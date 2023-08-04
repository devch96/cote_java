package lv2;

import java.util.*;

public class ChangeNum {
    public static int solution(int x, int y, int n){
        int[] dist = new int[1000001];
        Arrays.fill(dist,0);
        dist[x] = 1;
        Deque<Integer> queue = new ArrayDeque<>();
        queue.add(x);
        while (!queue.isEmpty()) {
            int num = queue.pollFirst();
            if (num + n <= 1000000 && dist[num + n] == 0) {
                dist[num+n] = dist[num]+1;
                queue.add(num + n);
            }
            if (num * 2 <= 1000000 && dist[num * 2] == 0) {
                dist[num*2] = dist[num]+1;
                queue.add(num*2);
            }
            if (num * 3 <= 1000000 && dist[num * 3] == 0) {
                dist[num*3] = dist[num]+1;
                queue.add(num * 3);
            }
        }
        return dist[y] -1;
    }
    
}
