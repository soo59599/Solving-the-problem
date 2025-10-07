import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i <= discount.length - 10; i++) {
            Map<String, Integer> cart = new HashMap<>();
            for (int k = 0; k < want.length; k++) {
                cart.put(want[k], number[k]);
            }
            for (int j = 0; j < 10; j++) {
                if (cart.containsKey(discount[i + j])) {
                    cart.put(discount[i + j], cart.get(discount[i + j]) - 1);
                } else {
                    break;
                }
            }
            boolean ok = true;
            for (int val : cart.values()) {
                if (val != 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) answer++;
        }

        return answer;
    }

}