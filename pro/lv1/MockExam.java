package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MockExam {
    public int[] solution(int[] answers){
        List<Integer> answer = new ArrayList<>();
        int[] no1 = {1,2,3,4,5};
        int check1 = 0;
        int[] no2 = {2,1,2,3,2,4,2,5};
        int check2 = 0;
        int[] no3 = {3,3,1,1,2,2,4,4,5,5};
        int check3 = 0;
        for(int idx = 0; idx < answers.length; idx++){
            if(answers[idx] == no1[idx%no1.length]){
                check1++;
            }
            if(answers[idx] == no2[idx%no2.length]){
                check2++;
            }
            if(answers[idx] == no3[idx%no3.length]){
                check3++;
            }
        }
        int max = Math.max(check3,Math.max(check1, check2));
        if(check1 == max){
            answer.add(1);
        }
        if(check2 == max){
            answer.add(2);
        }
        if(check3 == max){
            answer.add(3);
        }
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
