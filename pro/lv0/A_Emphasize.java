import java.util.Locale;

public class A_Emphasize {
    public String solution(String myString){
        myString = myString.toLowerCase();
        return myString.replace('a','A');
    }

    public static void main(String[] args) {
        A_Emphasize aEmphasize = new A_Emphasize();
        System.out.println(aEmphasize.solution("abstract algebra"));
    }
}
