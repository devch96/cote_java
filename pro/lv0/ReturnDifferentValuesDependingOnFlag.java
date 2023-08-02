package lv0; public class ReturnDifferentValuesDependingOnFlag {
    public int solution(int a, int b, boolean flag){
        return flag ? a+b : a-b;
    }

    public static void main(String[] args) {
        ReturnDifferentValuesDependingOnFlag returnDifferentValuesDependingOnFlag = new ReturnDifferentValuesDependingOnFlag();
        System.out.println(returnDifferentValuesDependingOnFlag.solution(-4, 7, true));
    }
}
