package lv1;

public class Sqrt {
    public static long solution(long n){
        if(Math.sqrt(n) == Math.floor(Math.sqrt(n))){
            return (long) Math.pow(Math.sqrt(n)+1,2);
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(101));
    }
}
