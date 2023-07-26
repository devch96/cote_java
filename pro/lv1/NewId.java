package lv1;

import java.util.Locale;

public class NewId {
    public static String solution(String new_id){
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("([^a-z0-9-_.])","");
        new_id = new_id.replaceAll("\\.+",".");
        if(!new_id.isBlank() && new_id.charAt(0) == '.'){
            new_id = new_id.substring(1);
        }
        if(!new_id.isBlank() && new_id.charAt(new_id.length()-1) == '.'){
            new_id = new_id.substring(0, new_id.length() - 1);
        }
        if(new_id.isBlank()){
            new_id = "a";
        }
        if(new_id.length() >= 16){
            if(new_id.charAt(14) == '.'){
                new_id = new_id.substring(0,14);
            }else{
                new_id = new_id.substring(0,15);
            }
        }
        if(new_id.length() <= 2){
            while(new_id.length() < 3){
                new_id = new_id + new_id.charAt(new_id.length()-1);
            }
        }
        return new_id;
    }
    public static void main(String[] args) {
        System.out.println(solution("abcdefghijklmn.p"));
    }
}
