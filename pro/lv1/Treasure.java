package lv1;

import java.util.Arrays;

public class Treasure {
    public static String[] solution(int n, int[] arr1, int[] arr2){
        String[] map = new String[n];
        for(int i = 0; i < n; i++){
            StringBuilder line = new StringBuilder();
            String arr1BinaryString = "0".repeat(n - Integer.toBinaryString(arr1[i]).length()) + Integer.toBinaryString(arr1[i]);
            String arr2BinaryString = "0".repeat(n - Integer.toBinaryString(arr2[i]).length()) + Integer.toBinaryString(arr2[i]);
            arr1BinaryString = arr1BinaryString.replaceAll("1","#");
            arr2BinaryString = arr2BinaryString.replaceAll("1","#");
            for(int j = 0; j < n; j++){
                if(arr1BinaryString.charAt(j) == '#' || arr2BinaryString.charAt(j) == '#') {
                    line.append('#');
                }else{
                    line.append(" ");
                }
            }
            map[i] = line.toString();
        }
        return map;
//                    result[i] = Integer.toBinaryString(arr1[i] | arr2[i]); 비트연산자
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[] {9,20,28,18,11}, new int[] {30,1,21,17,28})));
    }

}
