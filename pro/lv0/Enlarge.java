package lv0;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Enlarge {
    public static String[] solution(String[] picture, int k){
        List<String> enlargePicture = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            StringBuilder sb = new StringBuilder();
            for(char c : picture[i].toCharArray()){
                sb.append(String.valueOf(c).repeat(k));
            }
            for(int j = 0; j < k; j++){
                enlargePicture.add(sb.toString());
            }
        }
        return enlargePicture.toArray(new String[0]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."}, 2)));
    }
}
