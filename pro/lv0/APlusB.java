package lv0;

import java.math.BigInteger;

public class APlusB {
    public String solution(String a, String b){
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i =0; i < Math.max(a.length(),b.length()); i++){
            int numA = i < a.length() ? a.charAt(a.length() -1 - i) - '0' : 0;
            int numB = i < b.length() ? b.charAt(b.length() -1 - i) - '0' : 0;
            int sum = numA + numB + carry;
            carry = sum/10;
            sb.insert(0, sum % 10);
        }
        if(carry > 0){
            sb.insert(0, carry);
        }
        return sb.toString();
    }
}
