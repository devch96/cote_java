package lv1;

public class IsDigit {
    public static boolean solution(String s){
        if(s.length() == 4 || s.length() == 6){
            for(char c : s.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}
