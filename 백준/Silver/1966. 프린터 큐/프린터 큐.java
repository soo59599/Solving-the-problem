import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int tests = Integer.parseInt(br.readLine());
        for (int i = 0; i < tests; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());

            int[] tasks = new int[N];
            for (int j = 0; j < N; j++) {
                tasks[j] = Integer.parseInt(st.nextToken());
            }

            Queue<int[]> q = new LinkedList<>();
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < N; j++) {
                q.add(new int[]{j, tasks[j]});
                pq.add(tasks[j]);
            }

            int ans = 0;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                if (cur[1] == pq.peek()) {
                    pq.poll();
                    ans++;
                    if (cur[0] == M) {
                        break;
                    }
                } else {
                    q.add(cur);
                }
            }
            bw.write(ans + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}

