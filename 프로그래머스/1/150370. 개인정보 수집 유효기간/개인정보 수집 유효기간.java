import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        //today = YYYY.MM.DD
        //terms = A(약관 종류) 유효기간(달수)
        //privacies = t+1번 수집 일자 A(약관 종류)
        List<Integer> list = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate todayDate = LocalDate.parse(today, dtf);

        String[][] termsList = new String[terms.length][2];
        for (int i = 0; i < terms.length; i++) {
            termsList[i] = terms[i].split(" ");
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] strs = privacies[i].split(" ");
            int month = 0;
            for (int j = 0; j < termsList.length; j++) {
                if (strs[1].equals(termsList[j][0])) {
                    month = Integer.parseInt(termsList[j][1]);
                    break;
                }

            }
            LocalDate privacyDate = LocalDate.parse(strs[0], dtf);
            LocalDate privacyDateLater = privacyDate.plusMonths(month);

            if (!privacyDateLater.isAfter(todayDate)) {
                list.add(i + 1);
            }

        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}