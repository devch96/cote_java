package lv2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Cache {
    public static int solution(int cacheSize, String[] cities){
        ArrayDeque<String> queue = new ArrayDeque<>();
        int answer = 0;
        for(String city : cities){
            city = city.toLowerCase();
            if(queue.remove(city)){
                queue.add(city);
                answer+=1;
            }else{
                queue.add(city);
                answer+=5;
                if(queue.size() > cacheSize){
                    queue.pollFirst();
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(0,new String[] {"Jeju", "Jeju", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}
