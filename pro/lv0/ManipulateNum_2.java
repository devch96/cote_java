package lv0; public class ManipulateNum_2 {
    public static String solution(int[] numLog){
        StringBuilder answer = new StringBuilder();
        for(int i = 1; i < numLog.length; i++){
            int interval = numLog[i] - numLog[i-1];
            if(interval == 1){
                answer.append("w");
            } else if (interval == -1) {
                answer.append("s");
            } else if (interval == 10) {
                answer.append("d");
            } else answer.append("a");
        }
        return answer.toString();
    }
}
