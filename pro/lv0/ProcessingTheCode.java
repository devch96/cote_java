package lv0; public class ProcessingTheCode {
    public String solution(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;
        for(int idx = 0; idx < code.length(); idx++){
            if(mode == 0){
                if(code.charAt(idx) == '1'){
                    mode = 1;
                }else{
                    if(idx%2 == 0){
                        ret.append(code.charAt(idx));
                    }
                }
            }else{
                if(code.charAt(idx) == '1'){
                    mode = 0;
                }else{
                    if(idx%2 != 0){
                        ret.append(code.charAt(idx));
                    }
                }
            }
        }
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }
}
