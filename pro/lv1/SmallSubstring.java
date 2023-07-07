package lv1;

public class SmallSubstring {
    public static int solution(String t, String p){
        int count = 0;
        for(int idx = 0; idx <= t.length()-p.length(); idx++){
            if(Long.parseLong(t.substring(idx, idx+p.length())) - Long.parseLong(p) <= 0){
                count++;
            }
        }
        return count;
    }
}
