import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 중복 신고 제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));

        // 누적 신고된 횟수
        Map<String, Integer> reportedCount = new HashMap<>();
        for (String value : reportSet) {
            String[] parts = value.split(" ");
            String reported = parts[1];
            reportedCount.put(reported, reportedCount.getOrDefault(reported, 0) + 1);
        }

        //정답 배열
        Map<String, Integer> answerMap = new HashMap<>();
        for (String id : id_list) {
            answerMap.put(id, 0);
        }

        // 신고자가 받는 메일 수
        for (String value : reportSet) {
            String[] parts = value.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            if (reportedCount.getOrDefault(reported, 0) >= k) {
                answerMap.put(reporter, answerMap.get(reporter) + 1);
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = answerMap.get(id_list[i]);
        }

        return answer;
    }
}