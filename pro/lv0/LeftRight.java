package lv0;
import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRight {
    public static String[] solution(String[] str_list){
        for(int i = 0 ; i < str_list.length; i++){
            if(str_list[i].equals("r")){
                return Arrays.copyOfRange(str_list, i+1, str_list.length);
            } else if (str_list[i].equals("l")) {
                return Arrays.copyOfRange(str_list, 0, i);
            }
        }
        return new String[] {};
    }
}
