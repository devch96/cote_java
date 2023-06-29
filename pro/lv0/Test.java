import java.util.*;
import java.util.stream.IntStream;

public class Test {
    public static int solution(int[] rank, boolean[] attendance){
        int answer = 0;
        Map<Integer, Integer> rankIndex = new HashMap<>();
        List<Integer> attendanceRank = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            rankIndex.put(rank[i],i);
            if(attendance[i]){
                attendanceRank.add(rank[i]);
            }
        }
        Collections.sort(attendanceRank);
        for(int i = 0; i < 3 ; i ++){
            answer += 10000 / Math.pow(100,i) * rankIndex.get(attendanceRank.get(i));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3, 7, 2, 5, 4, 6, 1}, new boolean[] {false, true, true, true, true, false, false}));
    }
}
