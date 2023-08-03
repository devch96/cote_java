package lv2;

public class VowelDictionary {
    public static int solution(String word){
        int answer = 0;
        char[] dict = {'A', 'E', 'I', 'O', 'U'};
        int[] li = {781, 156, 31, 6, 1};
        for(int i = 0 ; i < word.length(); i++){
            int idx = 0;
            for(int dictidx = 0; dictidx<dict.length; dictidx++){
                if(dict[dictidx] == word.charAt(i)){
                    idx = dictidx;
                    break;
                }
            }
            answer += idx * li[i];
        }
        answer += word.length();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("AAAAA"));
    }
}
