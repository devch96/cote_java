public class Decryption {
    public String solution(String cipher, int code){
        String answer = "";
        for(int i = 0; i<cipher.length(); i++){
            if((i+1)%code == 0){
                answer+=cipher.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Decryption decryption = new Decryption();
        System.out.println(decryption.solution("dfjardstddetckdaccccdegk", 4));
    }
}