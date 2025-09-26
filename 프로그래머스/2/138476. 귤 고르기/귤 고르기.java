import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        int answer = 0;
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (sum >= k) {
                return answer;
            }
            answer++;
            sum += list.get(i).getValue();
        }

        return answer;
    }
}