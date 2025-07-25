import java.io.*;

class Solution {
    public String solution(String s) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        char[] charArray = s.toCharArray();

        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isWhitespace(charArray[i])) {
                sb.append(" ");
                count = 0;

            } else if(charArray[i] == '-'){
                sb.append("-");
                count = 0;
            }else {
                    if (count % 2 == 0) {
                        sb.append(String.valueOf(charArray[i]).toUpperCase());
                        count++;
                    } else {
                        sb.append(String.valueOf(charArray[i]).toLowerCase());
                        count++;
                    }
                }
            }

        answer = sb.toString();

        return answer;
    }
}
