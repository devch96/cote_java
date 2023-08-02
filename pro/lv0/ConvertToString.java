

package lv0; public class ConvertToString {
    public String solution(int n){
        return Integer.toString(n);
    }

    public static void main(String[] args) {
        ConvertToString convertToString = new ConvertToString();
        System.out.println(convertToString.solution(123));
    }
}
