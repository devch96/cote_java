package lv2;

import java.util.*;

public class OpenChat {
    public static String[] solution(String[] record){
        List<String> roomRecord = new ArrayList<>();
        Map<String, String> userNickname = new HashMap<>();
        for(String s : record){
            String[] strings = s.split(" ");
            String inout = "";
            String userId = "";
            String nickname = "";
            if(strings.length == 3){
                inout = strings[0];
                userId = strings[1];
                nickname = strings[2];
            }else{
                inout = strings[0];
                userId = strings[1];
            }
            if(inout.equals("Enter")){
                roomRecord.add(userId + "님이 들어왔습니다.");
            }else if(inout.equals("Leave")){
                roomRecord.add(userId + "님이 나갔습니다.");
            }
            if(!inout.equals("Leave")) {
                userNickname.put(userId, nickname);
            }
        }
        String[] answer = new String[roomRecord.size()];
        for(int idx = 0; idx < roomRecord.size(); idx++){
            String rec = roomRecord.get(idx);
            String recUserId = rec.split("님")[0];
            answer[idx] = rec.replace(recUserId, userNickname.get(recUserId));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"})));
    }
}
