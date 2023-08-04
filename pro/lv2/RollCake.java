package lv2;

import java.util.*;
import java.util.stream.Collectors;

public class RollCake {
    public static int solution(int[] topping){
        int[] leftCumulativeSum = getLeftCumulativeSum(topping);
        int[] rightCumulativeSum = getRightCumulativeSum(topping);
        int answer = getCount(leftCumulativeSum, rightCumulativeSum);
        return answer;
    }

    public static int getCount(int[] leftCumulativeSum, int[] rightCumulativeSum) {
        int count = 0;
        for (int idx = 0; idx < leftCumulativeSum.length - 1; idx++) {
            if (leftCumulativeSum[idx] == rightCumulativeSum[idx + 1]) {
                count++;
            }
        }
        return count;
    }

    public static int[] getLeftCumulativeSum(int[] topping){
        int[] arr = new int[topping.length];
        Set<Integer> alreadyIn = new HashSet<>();
        for (int i = 0, count = 0; i < topping.length; i++) {
            int num = topping[i];
            if (!alreadyIn.contains(num)) {
                alreadyIn.add(num);
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }

    public static int[] getRightCumulativeSum(int[] topping){
        int[] arr = new int[topping.length];
        Set<Integer> alreadyIn = new HashSet<>();
        for (int i = topping.length - 1, count = 0; i >= 0; i--) {
            int num = topping[i];
            if (!alreadyIn.contains(num)) {
                alreadyIn.add(num);
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {1, 2, 3, 1, 4}));
    }
}
