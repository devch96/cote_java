

package lv0; public class AddDigits {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for(char str1 : str.toCharArray()){
            answer += (int)(str1 - '0');
        }
        return answer;
//        while(n>0)
//
//        {
//            answer += n % 10;
//            n /= 10;
//        }
//        return answer;
    }


}
