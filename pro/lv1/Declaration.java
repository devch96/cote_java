package lv1;

import java.util.*;

public class Declaration {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Set<String> tmp = new HashSet<>(Arrays.asList(report));
        Map<String, List<String>> reports = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();
        int[] answer = new int[id_list.length];
        for(String s : tmp){
            String[] temp = s.split(" ");
            List<String> list = reports.getOrDefault(temp[0], new ArrayList<>());
            list.add(temp[1]);
            reports.put(temp[0], list);
            count.put(temp[1], count.getOrDefault(temp[1],0)+1);
        }
        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> a : count.entrySet()){
            if(a.getValue() >= k){
                result.add(a.getKey());
            }
        }
        for (int idx = 0; idx < id_list.length; idx++) {
            int cnt = 0;
            if(reports.containsKey(id_list[idx])){
                for(String s : result){
                    if(reports.get(id_list[idx]).contains(s)){
                        cnt++;
                    }
                }
            }
            answer[idx] = cnt;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"abc", "acd", "add", "abd"}, new String[] {"abc abd", "abc add", "acd abd", "abc abd", "add abd"}, 2)));
    }
}
