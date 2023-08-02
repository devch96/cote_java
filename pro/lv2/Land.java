package lv2;

import java.util.Arrays;

public class Land {
    public static int solution(int[][] land){
        for(int idx = 1; idx < land.length; idx++){
            land[idx][0] += Math.max(Math.max(land[idx-1][1],land[idx-1][2]),land[idx-1][3]);
            land[idx][1] += Math.max(Math.max(land[idx-1][0],land[idx-1][2]),land[idx-1][3]);
            land[idx][2] += Math.max(Math.max(land[idx-1][0],land[idx-1][1]),land[idx-1][3]);
            land[idx][3] += Math.max(Math.max(land[idx-1][0],land[idx-1][1]),land[idx-1][2]);
        }
        return Arrays.stream(land[land.length - 1]).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
    }
}
