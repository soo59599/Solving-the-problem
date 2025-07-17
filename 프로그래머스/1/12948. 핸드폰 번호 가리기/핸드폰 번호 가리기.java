import java.util.Scanner;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        for(int i = 0; i < length-4; i++) {
            answer +="*";
        }
        for(int j = length-4; j < length; j++) {
            answer += phone_number.charAt(j);
        }
        return answer;
    }
}
