package lv1;

import java.util.Stack;

public class CraneGame {
    public static int solution(int[][] board, int[] moves){
        int answer = 0;
        Stack<Integer> stk = new Stack<>();
        for(int location : moves){
            for(int idx = 0; idx < board.length; idx++){
                int doll = board[idx][location-1];
                if(doll != 0){
                    board[idx][location-1] = 0;
                    if(stk.isEmpty()){
                        stk.push(doll);
                        break;
                    }else if(stk.peek() != doll){
                        stk.push(doll);
                        break;
                    }else{
                        stk.pop();
                        answer+=2;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}}, new int[] {1,5,3,5,1,2,1,4}));
    }
}
