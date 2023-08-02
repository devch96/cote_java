package lv2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShortestDistance {
    public int solution(int[][] maps){
        int n = maps.length-1;
        int m = maps[0].length-1;
        Deque<int[]> deque = new ArrayDeque<>();
        int[] dx = {0,0,-1,1};
        int[] dy = {1,-1,0,0};
        deque.add(new int[] {0,0});
        while (!deque.isEmpty()) {
            int[] xy = deque.pollFirst();
            int x = xy[0];
            int y = xy[1];
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (0 <= nx && nx <= n && 0 <= ny && ny <= m && maps[nx][ny] == 1) {
                    maps[nx][ny] = maps[x][y] + 1;
                    deque.add(new int[]{nx, ny});
                }
            }
        }
        int distance = maps[n][m];
        return distance != 1 ? distance : -1;
    }
}
