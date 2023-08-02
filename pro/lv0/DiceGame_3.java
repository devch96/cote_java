package lv0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

 public class DiceGame_3 {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};

        // 주사위 숫자의 개수를 세기 위해 배열을 초기화합니다.
        int[] count = new int[7];
        for (int i = 0; i < 4; i++) {
            count[dice[i]]++;
        }

        // 주사위 숫자가 모두 같은 경우
        if (count[a] == 4) {
            return a * 1111;
        }

        // 주사위 숫자가 세 개가 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 3) {
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        return (10 * i + j) * (10 * i + j);
                    }
                }
            }
        }

        // 주사위 숫자가 두 개씩 같은 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 2 && i != j) {
                        return (i + j) * Math.abs(i - j);
                    }
                }
            }
        }

        // 주사위 숫자가 두 개씩 다른 경우
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 2) {
                for (int j = 1; j <= 6; j++) {
                    if (count[j] == 1) {
                        for (int k = 1; k <= 6; k++) {
                            if (count[k] == 1 && k != j) {
                                return j * k;
                            }
                        }
                    }
                }
            }
        }

        // 주사위 숫자가 모두 다른 경우
        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= 6; i++) {
            if (count[i] == 1) {
                minNum = Math.min(minNum, i);
            }
        }

        return minNum;
    }
}
