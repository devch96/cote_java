package lv0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split3 {
    public String[] solution(String myStr){
        return myStr.split("[abc]").length > 0 ?
                Arrays.stream(myStr.split("[abc]")).filter(i -> i.length() != 0).toArray(String[]::new) :
                new String[] { "EMPTY" };
    }
}
