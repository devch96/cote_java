package lv1;

import java.util.Arrays;

public class Clothes {
    public static int solution(int n, int[] lost, int[] reserve){
        // 학생들의 체육복 상태를 나타내는 배열
        int[] clothes = new int[n];

        // 모든 학생들에게 체육복을 1벌씩 할당
        Arrays.fill(clothes, 1);

        // 체육복을 도난당한 학생들은 체육복 개수에서 1을 빼줌
        for (int lostStudent : lost) {
            clothes[lostStudent - 1]--;
        }

        // 여벌의 체육복을 가져온 학생들은 체육복 개수에서 1을 더해줌
        for (int reserveStudent : reserve) {
            clothes[reserveStudent - 1]++;
        }

        // 체육복을 빌려줄 수 있는 학생들에게 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            // 체육복이 없는 학생일 경우
            if (clothes[i] == 0) {
                // 앞번호 학생이 여벌의 체육복을 가지고 있는 경우
                if (i > 0 && clothes[i - 1] == 2) {
                    clothes[i]++;
                    clothes[i - 1]--;
                }
                // 뒷번호 학생이 여벌의 체육복을 가지고 있는 경우
                else if (i < n - 1 && clothes[i + 1] == 2) {
                    clothes[i]++;
                    clothes[i + 1]--;
                }
            }
        }

        // 체육수업을 들을 수 있는 학생 수 카운트
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (clothes[i] > 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, new int[] {2,4}, new int[] {1,3,5}));
        System.out.println(solution(5, new int[] {2,4}, new int[] {3}));
        System.out.println(solution(3, new int[] {3}, new int[] {1}));
    }
}
