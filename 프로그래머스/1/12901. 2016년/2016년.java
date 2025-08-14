import java.time.LocalDate;
import java.util.Scanner;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String answer = "";
        LocalDate day = LocalDate.of(2016,1,1);
        LocalDate localDate = LocalDate.of(2016, a, b);

        long l = localDate.toEpochDay() - day.toEpochDay();

        int l1 = (int)(l % 7);

        answer=days[l1];

        return answer;
    }
}