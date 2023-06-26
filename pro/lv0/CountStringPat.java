public class CountStringPat {
    public static int solution(String myString, String pat){
        int answer = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.substring(i).startsWith(pat)){
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana","ana"));
        System.out.println(solution("aaaa","aa"));
    }
}
