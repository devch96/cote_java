package lv2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Rescue {
    public static int solution(int[] people, int limit){
        Arrays.sort(people);
        int answer = 0;
        int left = 0;
        int right = people.length-1;
        while(left<=right){
            if(left == right){
                answer++;
                break;
            }
            if(people[left] + people[right] <= limit){
                answer+=1;
                right--;
                left++;
            }
            else{
                answer++;
                right-=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {70, 50, 80, 50}, 100));
        System.out.println(solution(new int[] {70, 80, 50}, 100));
    }
}
