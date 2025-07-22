import java.util.Scanner;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        for(int i = 0; i < count; i++) {
            answer += (long) price * (i+1);
            System.out.println("i = " + i);
            System.out.println("answer = " + answer);
        }
        if(money-answer > 0) {
            answer = 0;
        }else{
            answer = answer - money;
        }

        return answer;
    }
}