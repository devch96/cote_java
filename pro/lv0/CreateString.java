public class CreateString {
    public static String solution(String my_string, int[] index_list){
        StringBuilder answer = new StringBuilder();
        for(int index : index_list){
            answer.append(my_string.charAt(index));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(CreateString.solution("cvsgiorszzzmrpaqpe", new int[] {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7}));
    }
}
