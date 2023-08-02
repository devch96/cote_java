package lv0;
import java.util.*;

public class olive2 {
    public int solution(String[] kor, String[] usa, String[] incs) {
        List<String> k = new ArrayList<>(Arrays.asList(kor));
        List<String> u = new ArrayList<>(Arrays.asList(kor));
        Map<String, Integer> incsMap = new HashMap<>();
        int answer = -1;
        for(String dayIncs : incs) {
            String[] dayIncreases = dayIncs.split(" ");
            for (int i = 0; i < dayIncreases.length - 1; i++) {
                for (int j = i; j < dayIncreases.length; j++) {
                    if (k.contains(dayIncreases[i]) != u.contains(dayIncreases[j])){
//                        incsMap.put(dayIncreases[i])
                    }
                }
            }
        }
    return answer;


}

    public static void main(String[] args) {
        for(int i = 0; i < 1; i++){
            System.out.println(i);
        }
//        olive2 olive2 = new olive2();
//        String[] kor = {"AAA","BCD","AAAAA","ZY"};
//        String[] usa = {"AB","AA","TTTT"};
//        String[] incs = {"AB BCD AA AAA TTTT AAAAA", "BCD AAA", "AB AAA TTTT BCD", "AA AAAAA AB", "AAA AB BCD"};
//        System.out.println(olive2.solution(kor,usa,incs));

    }


}
