import java.util.Scanner;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()!=4 && s.length()!=6) {
            return false;
        }
        for(int i = 0; i < s.length(); i++) {
            if(48>s.charAt(i)||s.charAt(i)>57){
                return false;
            }
        }
        return answer;
    }
}