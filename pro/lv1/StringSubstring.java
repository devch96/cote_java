package lv1;

public class StringSubstring {
    public String solution(String phone_number){
        return "*".repeat(phone_number.length()-5)+ phone_number.substring(phone_number.length()-5,phone_number.length());
    }
}
