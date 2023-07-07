package lv1;

import java.util.Arrays;

public class LeastRectangle {
    public static int solution(int[][] sizes){
        int width = 0;
        int height = 0;
        for(int[] size : sizes){
            Arrays.sort(size);
            width = Math.max(size[0], width);
            height = Math.max(size[1], height);
        }
        return width*height;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{60,50},{30,70},{60,30},{80,40}}));
    }
}
