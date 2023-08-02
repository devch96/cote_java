package lv0; public class Last_N_CharactersOfString {

    public String solution(String my_string, int n){
        return my_string.substring(my_string.length()-n);
    }

    public static void main(String[] args) {
        Last_N_CharactersOfString l = new Last_N_CharactersOfString();
        System.out.println(l.solution("ProgrammerS123",11));
    }
}
