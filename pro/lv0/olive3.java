import java.util.*;

public class olive3 {
    public int[] solution(String[][] folders, String[][] files, String[] selected, String[] excepted) {
        int[] answer = new int[2];
        HashSet<String> exceptedSet = new HashSet<>(Arrays.asList(excepted));

        int numFiles = 0;
        long fileSize = 0;

        for (String[] folder : folders) {
            String folderName = folder[0];
            String parentName = folder[1];

            if (Arrays.asList(selected).contains(folderName)) {
                for (String[] file : files) {
                    String fileName = file[0];
                    String fileSizeStr = file[1];
                    String fileFolderName = file[2];

                    if (fileFolderName.equals(folderName) && !exceptedSet.contains(fileName)) {
                        numFiles++;
                        fileSize += getFileSizeInBytes(fileSizeStr);
                    }
                }
            }
        }
        answer[0] = (int) fileSize;
        answer[1] = numFiles;
        return answer;
    }

    // 파일 크기를 byte 단위로 변환해주는 함수
    private int getFileSizeInBytes(String fileSizeStr) {
        int fileSize = 0;

        if (fileSizeStr.endsWith("B")) {
            fileSize = Integer.parseInt(fileSizeStr.substring(0, fileSizeStr.length() - 1));
        } else if (fileSizeStr.endsWith("KB")) {
            fileSize = Integer.parseInt(fileSizeStr.substring(0, fileSizeStr.length() - 2)) * 1024;
        }
        return fileSize;
    }


    public static void main(String[] args) {
        olive3 olive3 = new olive3();
        String[][] folders = {{"animal","root"},{"fruit","root"}};
        String[][] files = {{"cat","1B","animal"},{"dog","2B","animal"},{"apple","4B","fruit"}};
        String[] selected = {"animal"};
        String[] excepted = {"apple"};
        int[] arr = olive3.solution(folders,files,selected,excepted);
        for(int a : arr){
            System.out.println(a);
        }
    }
}

