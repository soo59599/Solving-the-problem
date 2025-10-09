import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for (int i = 0; i < priorities.length; i++) {
            q.add(new int[]{i, priorities[i]});
            pq.add(priorities[i]);
        }
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();

            if (cur[1] == pq.peek()) {
                pq.poll();
                answer++;
                if (cur[0] == location) {
                    return answer;
                }
            } else {
                q.add(cur);
            }
        }
        return answer;
    }
}