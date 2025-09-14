
import java.util.ArrayDeque;
import java.util.Deque;

    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            Deque<Integer> stack = new ArrayDeque<>();
            for (int i = 0; i < ingredient.length; i++) {
                stack.push(ingredient[i]);

                if (stack.size() >= 4) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int c = stack.pop();
                    int d = stack.pop();

                    if (a == 1 && b == 3 && c == 2 && d == 1) {
                        answer++;
                    } else {
                        stack.push(d);
                        stack.push(c);
                        stack.push(b);
                        stack.push(a);
                    }
                }
            }
            return answer;
        }
    }