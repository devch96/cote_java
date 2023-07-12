package lv1;

import java.util.Arrays;

public class MakePrimeNum {
    public int solution(int[] nums){
        int answer = 0;
        for(int idx1 = 0; idx1 < nums.length; idx1 ++){
            for(int idx2 = idx1+1; idx2 < nums.length; idx2++){
                for(int idx3 = idx2+1; idx3 < nums.length; idx3++){
                    if(isPrime(nums[idx1]+nums[idx2]+nums[idx3])){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean isPrime(int num){
        if(num == 1){
            return false;
        } else if (num == 2) {
            return true;
        } else{
            for(int i = 2; i < Math.floor(Math.sqrt(num)) + 1; i++){
                if(num % i == 0){
                    return false;
                }
            }
        }return true;
    }
}
