public class StringReverses {
    public String solution(String my_string, int[][] queries){
        StringBuilder sb = new StringBuilder(my_string);
        for(int[] query : queries){
            sb.replace(query[0],query[1],new StringBuilder(sb.substring(query[0],query[1])).reverse().toString());
        }
        return sb.toString();
    }
}
