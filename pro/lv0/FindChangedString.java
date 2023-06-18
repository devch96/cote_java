public class FindChangedString {
    public static int solution(String myString, String pat){
        StringBuilder sb = new StringBuilder();
        for(char c : myString.toCharArray()){
            sb.append(c == 'A' ? "B" : "A");
        }
        return sb.indexOf(pat) == -1 ? 0 : 1;
    }

    public static void main(String[] args) {
        System.out.println(solution("ABBAA","AABB"));
    }
}
