package lv2;

import javax.swing.text.html.HTMLDocument;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TotalLength {
    public static int solution(String dirs){
        int[] location = new int[] {0,0};
        Set<String> loc = new HashSet<>();
        for (char dir : dirs.toCharArray()) {
            int[] nextLocation = move(location, dir);
            if(!Arrays.equals(location, nextLocation)){
                StringBuilder sb = new StringBuilder();
                StringBuilder sb1 = new StringBuilder();
                sb.append(""+location[0] + location[1] + "to" + nextLocation[0] + nextLocation[1] );
                sb1.append(""+nextLocation[0] + nextLocation[1] + "to" + location[0]+ location[1]);
                loc.add(sb.toString());
                loc.add(sb1.toString());
                location = nextLocation;
            }
        }
        return loc.size() / 2;
    }
    
    public static int[] move(int[] now, char dir){
        int[] next = Arrays.copyOf(now,2);
        if(dir=='L' && now[0] >= -4){
            next[0] = now[0] - 1;
        } else if (dir==('R') && now[0] <= 4) {
            next[0] = now[0] + 1;
        } else if (dir==('U') && now[1] <= 4) {
            next[1] = now[1] + 1;
        } else if (dir==('D') && now[1] >= -4){
            next[1] = now[1] - 1;
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU"));
    }
}
