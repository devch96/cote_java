package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Drag {
    public static int[] solution(String[] wallpaper){
        List<Integer> x_Location = new ArrayList<>();
        List<Integer> y_Location = new ArrayList<>();
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    x_Location.add(i);
                    y_Location.add(j);
                }
            }
        }
        int[] answer = new int[4];
        answer[0] = Collections.min(x_Location);
        answer[1] = Collections.min(y_Location);
        answer[2] = Collections.max(x_Location)+1;
        answer[3] = Collections.max(y_Location)+1;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."})));
    }
}
