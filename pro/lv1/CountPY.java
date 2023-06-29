package lv1;

public class CountPY {
    boolean solution(String s) {
        s = s.toLowerCase();
        int p = 0;
        int y = 0;
        for(char c : s.toCharArray()){
            if(c == 'p'){
                p++;
            }else if(c == 'y'){
                y++;
            }
        }
        return p == y;
    }
}
