package lv2;

public class Jump {
    public int solution(int n){
        return Integer.toBinaryString(n).length() - Integer.toBinaryString(n).replace("1","").length();
    }
}
