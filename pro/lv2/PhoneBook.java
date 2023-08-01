package lv2;

import java.util.Arrays;

public class PhoneBook {
    public static boolean solution(String[] phone_book){
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }
        return true;
    }
}
