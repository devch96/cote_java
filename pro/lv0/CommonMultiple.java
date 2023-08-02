

package lv0; public class CommonMultiple {
    public static int solution(int number, int n, int m){
        return number % n == 0 && number % m == 0 ?  1 :  0;
    }

    public static void main(String[] args) {
        System.out.println(CommonMultiple.solution(55,10,5));
    }
}
