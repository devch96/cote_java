package lv2;

import java.util.ArrayList;
import java.util.List;

public class BlockGame {
    public static int solution(int m, int n, String[] board) {
        if(!check(m,n,board)){
            return 0;
        }
        while (check(m, n, board)) {
            List<Integer> xy = return_xy(m, n, board);
            for (int i = 0; i < xy.size(); i += 2) {
                int a = xy.get(i);
                int b = xy.get(i + 1);
                char[] charArr = board[a].toCharArray();
                char[] charArr2 = board[a+1].toCharArray();
                charArr[b] = 'c';
                charArr[b+1] = 'c';
                charArr2[b] = 'c';
                charArr2[b+1] = 'c';
                board[a] = new String(charArr);
                board[a+1] = new String(charArr2);
            }

            String[] board_T = transpose(m,n,board);
            for (int idx = 0; idx < board_T.length; idx++) {
                board_T[idx] = compression(board_T[idx]);
            }
            board = transpose(n,m,board_T);
        }

        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i].charAt(j) == 'c') {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static List<Integer> return_xy(int m, int n, String[] board){
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                char c = board[i].charAt(j);
                if (c != 'c' && c == board[i].charAt(j + 1) && c == board[i + 1].charAt(j) && c == board[i + 1].charAt(j + 1)) {
                    result.add(i);
                    result.add(j);
                }
            }
        }
        return result;
    }

    public static boolean check(int m, int n, String[] board){
        for (int i = 0; i < m-1; i++) {
            for (int j = 0; j < n - 1; j++) {
                char c = board[i].charAt(j);
                if (c != 'c' && c == board[i].charAt(j + 1) && c == board[i + 1].charAt(j) && c == board[i + 1].charAt(j + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String[] transpose(int m, int n, String[] board){
        String[] result = new String[n];
        for(int i = 0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < m; j++) {
                sb.append(board[j].charAt(i));
            }
            result[i]=sb.toString();
        }
        return result;
    }

    public static String compression(String s){
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (char c : s.toCharArray()) {
            if(c == 'c'){
                sb.append(c);
                continue;
            }else{
                sb2.append(c);
            }
        }
        return sb.append(sb2).toString();
    }


    public static void main(String[] args) {
        System.out.println(solution(4,5,new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"}));
    }
}
