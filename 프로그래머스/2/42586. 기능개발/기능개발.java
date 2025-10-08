
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < speeds.length; i++) {
            int length = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
            dq.addLast(length);
        }
        int current = dq.pop();
        int count = 1;
        
        while (!dq.isEmpty()) {
            int next = dq.peek();
            
            if(next <= current){
                dq.pop();
                count++;
            }else{
                result.add(count);
                current = dq.pop();
                count = 1;
            }
        }
        
        result.add(count);
        
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}