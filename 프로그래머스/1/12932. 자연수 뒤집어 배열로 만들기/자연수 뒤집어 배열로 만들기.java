import java.util.Scanner;

class Solution {
    public int[] solution(long n) {
        String[] digits = String.valueOf(n).split("");
        int[] answer = new int[digits.length];
        for(int i = 0; i < digits.length; i++) {
        answer[i] = Integer.parseInt(digits[digits.length - 1 - i]);
        }
        
        return answer;
    }
}