package lv2;

import java.util.ArrayDeque;
import java.util.Deque;

public class SkillTree {
    public static int solution(String skill, String[] skill_trees){
        int answer = 0;
        for (String skills : skill_trees) {
            StringBuilder checkBuilder = new StringBuilder();
            for (char ch : skills.toCharArray()) {
                if (skill.contains(String.valueOf(ch))) {
                    checkBuilder.append(ch);
                }
            }
            String check = checkBuilder.toString();
            if(skill.startsWith(check)){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
    }
}
