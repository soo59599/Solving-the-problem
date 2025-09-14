
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String solution(String[] survey, int[] choices) {
        String answer = "";
        char[] keys = {'R', 'T', 'C', 'F', 'J', 'M', 'A', 'N'};
        Map<Character, Integer> map = new HashMap<>();
        for (char k : keys) {
            map.put(k, 0);
        }

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) {
                char surveyChar = survey[i].charAt(0);
                int value = map.get(surveyChar);
                value = switch (choices[i]) {
                    case 1 -> value + 3;
                    case 2 -> value + 2;
                    case 3 -> value + 1;
                    default -> value;
                };
                map.put(surveyChar, value);
            }
            if (choices[i] > 4) {
                char surveyChar = survey[i].charAt(1);
                int value = map.get(surveyChar);
                value = switch (choices[i]) {
                    case 5 -> value + 1;
                    case 6 -> value + 2;
                    case 7 -> value + 3;
                    default -> value;
                };
                map.put(surveyChar, value);
            }
        }

        Integer r = map.get('R');
        Integer t = map.get('T');

        answer = r >= t ? answer + "R" : answer + "T";

        Integer c = map.get('C');
        Integer f = map.get('F');

        answer = c >= f ? answer + "C" : answer + "F";

        Integer j = map.get('J');
        Integer m = map.get('M');

        answer = j >= m ? answer + "J" : answer + "M";

        Integer a = map.get('A');
        Integer n = map.get('N');

        answer = a >= n ? answer + "A" : answer + "N";

        return answer;
    }


}



