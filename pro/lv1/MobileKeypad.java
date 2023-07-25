package lv1;

public class MobileKeypad {
    public static String solution(int[] numbers, String hand){
        int leftHandLocation = 10;
        int rightHandLocation = 12;
        StringBuilder answer = new StringBuilder();
        for(int pushNum : numbers){
            if(pushNum == 1 || pushNum == 4 || pushNum == 7){
                leftHandLocation = pushNum;
                answer.append("L");
            }else if(pushNum == 3 || pushNum == 6 || pushNum == 9){
                rightHandLocation = pushNum;
                answer.append("R");
            }else{
                if(pushNum == 0){
                    pushNum = 11;
                }
                int leftHandDistance = Math.floorDiv(Math.abs(leftHandLocation - pushNum),3) + Math.floorMod(Math.abs(leftHandLocation - pushNum),3);
                int rightHandDistance = Math.floorDiv(Math.abs(rightHandLocation - pushNum),3) + Math.floorMod(Math.abs(rightHandLocation - pushNum),3);
                if(leftHandDistance < rightHandDistance){
                    answer.append("L");
                    leftHandLocation = pushNum;
                }else if(leftHandDistance > rightHandDistance){
                    answer.append("R");
                    rightHandLocation = pushNum;
                }else{
                    if(hand.equals("right")){
                        answer.append("R");
                        rightHandLocation = pushNum;
                    }else{
                        answer.append("L");
                        leftHandLocation = pushNum;
                    }
                }
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
    }
}
