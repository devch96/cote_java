package lv1;

import java.util.ArrayList;
import java.util.List;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        List<double[]> temp = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int count = 0;
            for (int stage : stages) {
                if (stage >= i) {
                    count++;
                }
            }
            if (count > 0) {
                double failureRate = (double) stagesCount(i, stages) / count;
                temp.add(new double[]{i, failureRate});
            } else {
                temp.add(new double[]{i, 0});
            }
        }

        temp.sort((x, y) -> Double.compare(y[1], x[1]));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = (int) temp.get(i)[0];
        }

        return answer;
    }

    private int stagesCount(int stage, int[] stages) {
        int count = 0;
        for (int s : stages) {
            if (s == stage) {
                count++;
            }
        }
        return count;
    }
}
