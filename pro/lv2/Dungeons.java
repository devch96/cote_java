package lv2;

import java.awt.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Dungeons {
    public class Person{
        private int least;
        private List<Integer> use;

        public Person(int least, List<Integer> use){
            this.least = least;
            this.use = use;
        }

        public int getLeast() {
            return least;
        }

        public List<Integer> getUse() {
            return use;
        }
    }
    public int solution(int k, int[][] dungeons){
        Deque<Person> process = new ArrayDeque<>();
        int answer = 0;
        Person start = new Person(k, new ArrayList<>());
        process.add(start);
        while(!process.isEmpty()){
            Person p = process.pollFirst();
            int cur = p.getLeast();
            List<Integer> passed = p.getUse();
            for(int i = 0; i < dungeons.length; i++){
                int least = dungeons[i][0];
                int use = dungeons[i][1];
                if(!passed.contains(i) && cur>=least && cur - use >= 1){
                    List<Integer> newPassed = new ArrayList<>(passed);
                    newPassed.add(i);
                    Person c = new Person(cur - use, newPassed);
                    process.add(c);
                }else{
                    answer = Math.max(answer, passed.size());
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Dungeons d = new Dungeons();
        System.out.println(d.solution(10, new int[][] {{9,2},{10,3},{7,3},{5,4},{1,1}}));
    }


}
