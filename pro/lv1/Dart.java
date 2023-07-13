package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dart {
    public int solution(String dartResult){
        int answer = 0;
        int[] scores = new int[3]; // 각 기회의 점수를 저장할 배열
        int round = -1; // 현재 기회를 나타내는 변수

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);

            if (Character.isDigit(ch)) {
                round++; // 다음 기회로 넘어감
                if (ch == '1' && dartResult.charAt(i+1) == '0') {
                    scores[round] = 10;
                    i++; // '10'은 2글자로 처리
                } else {
                    scores[round] = ch - '0';
                }
            } else if (ch == 'S' || ch == 'D' || ch == 'T') {
                if (ch == 'D') {
                    scores[round] *= scores[round];
                } else if (ch == 'T') {
                    scores[round] *= scores[round] * scores[round];
                }
            } else if (ch == '*') {
                if (round > 0) { // 현재 기회가 첫 번째가 아닌 경우
                    scores[round-1] *= 2;
                }
                scores[round] *= 2;
            } else if (ch == '#') {
                scores[round] *= -1;
            }
        }

        for (int score : scores) {
            answer += score;
        }

        return answer;
    }
}
