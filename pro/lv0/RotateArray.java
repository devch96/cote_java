public class RotateArray {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        for (int i = 0; i < answer.length; i++) {
            int idx = i;
            if (direction.equals("right")) {
                idx = idx - 1 < 0 ? answer.length - 1 : idx - 1;
            } else {
                idx = idx + 1 > answer.length - 1 ? 0 : idx + 1;
            }
            answer[i] = numbers[idx];
        }
        return answer;
    }
}
