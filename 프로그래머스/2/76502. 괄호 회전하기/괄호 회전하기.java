
import java.util.*;

class Solution {
    public int solution(String s) {
        int n = s.length();
        int answer = 0;
        String doubled = s + s; // 두 배로 이어붙이기

        for (int i = 0; i < n; i++) {
            String rotated = doubled.substring(i, i + n); // i부터 n길이만큼 추출
            if (isValid(rotated)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isValid(String str) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
