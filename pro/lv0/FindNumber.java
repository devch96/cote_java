package lv0; public class FindNumber {
    public int solution(int num, int k){
        int answer = Integer.toString(num).indexOf(Integer.toString(k));
        if(answer==-1){
            return -1;
        }else return answer+1;
    }
}
