
import java.util.Arrays;
import java.util.Stack;

    class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();

            for(int i = 0; i < ingredient.length; i++) {
                stack.push(ingredient[i]);

                // 스택 크기가 4 이상이고, 마지막 4개가 [1,2,3,1] 패턴인지 확인
                if(stack.size() >= 4) {
                    // 스택의 맨 위부터 4개 요소 확인
                    int top1 = stack.get(stack.size() - 1);    // 맨 위 (4번째)
                    int top2 = stack.get(stack.size() - 2);    // 3번째
                    int top3 = stack.get(stack.size() - 3);    // 2번째  
                    int top4 = stack.get(stack.size() - 4);    // 1번째

                    // [1,2,3,1] 패턴 확인
                    if(top4 == 1 && top3 == 2 && top2 == 3 && top1 == 1) {
                        // 4개 요소 제거 (pop을 4번)
                        stack.pop();
                        stack.pop();
                        stack.pop();
                        stack.pop();

                        answer++;
                    }
                }
            }

            return answer;
        }
    }