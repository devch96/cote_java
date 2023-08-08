package lv2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrimeNum {
    public static int solution(String numbers){
        Set<Integer> primeSet = new HashSet<>();

        // 주어진 숫자로 만들 수 있는 모든 숫자 조합을 구하기
        generateNumberCombinations(numbers, "", primeSet);

        // 소수 개수 계산
        int count = 0;
        for (int num : primeSet) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    // 주어진 숫자로 만들 수 있는 모든 숫자 조합 생성
    private static void generateNumberCombinations(String remaining, String current, Set<Integer> primeSet) {
        if (!current.isEmpty()) {
            primeSet.add(Integer.parseInt(current));
        }

        for (int i = 0; i < remaining.length(); i++) {
            generateNumberCombinations(
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    current + remaining.charAt(i),
                    primeSet
            );
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution("011"));
    }
}
