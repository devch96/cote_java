public class Eval {
    public static int solution(String binomial){
        String[] strArr = binomial.split("\\s+");
        int a = Integer.parseInt(strArr[0]);
        int b = Integer.parseInt(strArr[2]);
        if (strArr[1].equals("+")) {
            return a+b;
        } else if(strArr[1].equals("-")){
            return a-b;
        } else{
            return a*b;
        }
    }
}
