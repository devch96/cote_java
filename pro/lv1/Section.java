package lv1;

public class Section {
    public int solution(int n, int m, int[] section){
        int answer = 0;
        int idx = section[0] - 1;
        for(int i : section){
            if(idx < i){
                idx = i+m-1;
                answer++;
            }
        }
        return answer;
    }
}
