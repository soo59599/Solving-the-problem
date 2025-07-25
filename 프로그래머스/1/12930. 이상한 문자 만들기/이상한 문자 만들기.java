import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        char[] charArray = s.toCharArray();

        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                answer += " ";
                count = 0;

            }else {
                    if (count % 2 == 0) {
                        answer += String.valueOf(charArray[i]).toUpperCase();
                        count++;
                    } else {
                        answer += String.valueOf(charArray[i]).toLowerCase();
                        count++;
                    }
                }
            }

        return answer;
    }
}