public class BacteriaGrowth {
    public int solution(int n, int t){
        int answer = (int) (n*(Math.pow(2,t)));
        return answer;

//        answer = n << t;
//        return answer;
    }
}
