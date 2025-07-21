import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String (chars)).reverse();
        answer = sb.toString();

        return answer;
    }
}