package lv2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sorting {
    public static String[] solution(String[] files){
        List<String[]> splitList = new ArrayList<>();
        String regex = "([a-zA-Z\\-\\n\\s.]+)([0-9]{0,5})(.*)";
        Pattern pattern = Pattern.compile(regex);
        for(String file : files){
            Matcher matcher = pattern.matcher(file);
            if (matcher.find()) {
                String head = matcher.group(1);
                String number = matcher.group(2);
                String tail = matcher.group(3);
                splitList.add(new String[] {head, number, tail});
            }
        }
        Collections.sort(splitList, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                int headCompare = o1[0].compareToIgnoreCase(o2[0]);
                if(headCompare != 0){
                    return headCompare;
                }
                return Integer.compare(Integer.parseInt(o1[1]), Integer.parseInt(o2[1]));
            }
        });
        String[] answer = new String[splitList.size()];
        for (int idx = 0; idx < splitList.size(); idx++) {
            answer[idx] = String.join("", splitList.get(idx));
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})));
    }
}
