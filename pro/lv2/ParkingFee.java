package lv2;

import java.util.*;

public class ParkingFee {
    public static int[] solution(int[] fees, String[] records){
        int basicTime = fees[0];
        int basicFee = fees[1];
        int minuteUnit = fees[2];
        int minuteFee = fees[3];
        List<String> carNumber = new ArrayList<>();
        Map<String, Integer> parkingTime = new HashMap<>();
        Map<String, String> parkingIn = new HashMap<>();
        for(String record : records){
            String[] split = record.split(" ");
            String time = split[0];
            String carNum = split[1];
            String inout = split[2];
            if(!carNumber.contains(carNum)) {
                carNumber.add(carNum);
            }

            if(inout.equals("IN")){
                parkingIn.put(carNum, time);
            }else{
                parkingTime.put(carNum, parkingTime.getOrDefault(carNum, 0) + diffMinute(parkingIn.get(carNum), time));
                parkingIn.remove(carNum);
            }
        }
        for(Map.Entry<String, String> remainCar : parkingIn.entrySet()){
            parkingTime.put(remainCar.getKey(), parkingTime.getOrDefault(remainCar.getKey(), 0) + diffMinute(parkingIn.get(remainCar.getKey()), "23:59"));
        }
        List<Integer> answer = new ArrayList<>();
        carNumber.sort(Comparator.naturalOrder());
        for(String car : carNumber){
            answer.add(totalFee(parkingTime.get(car), basicTime, basicFee, minuteUnit, minuteFee));
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int diffMinute(String inTime, String outTime){
        String[] inTimeSplit = inTime.split(":");
        String[] outTimeSplit = outTime.split(":");
        int inTimeHour = Integer.parseInt(inTimeSplit[0]);
        int inTimeMinute = Integer.parseInt(inTimeSplit[1]);
        int outTimeHour = Integer.parseInt(outTimeSplit[0]);
        int outTimeMinute = Integer.parseInt(outTimeSplit[1]);

        return (outTimeHour*60 + outTimeMinute) - (inTimeHour*60 + inTimeMinute);
    }

    public static int totalFee(int totalTime, int basicTime, int basicFee, int minuteUnit, int minuteFee){
        if(totalTime <= basicTime){
            return basicFee;
        }
        return ((int) (Math.ceil((double) (totalTime - basicTime) /minuteUnit)) * minuteFee) + basicFee;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {180, 5000, 10, 600}, new String[] {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})));
    }
}
