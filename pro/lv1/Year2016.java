package lv1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Year2016 {
    public static String solution(int a, int b) {
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30,31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        if(a > 1){
            total = Arrays.stream(Arrays.copyOfRange(month, 0,a-1)).sum() + b-1;
        }else{
            total = b-1;
        }
        return days[total%7];
    }

    public static void main(String[] args) {
        System.out.println(solution(5,24));
    }
}
