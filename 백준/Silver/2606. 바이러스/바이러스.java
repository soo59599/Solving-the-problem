
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int com = Integer.parseInt(br.readLine());
        int net = Integer.parseInt(br.readLine());

        boolean[] visited = new boolean[com + 1];

        ArrayList<Integer>[] arr = new ArrayList[com + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new ArrayList<>();
        }

        for (int i = 0; i < net; i++) {
            String[] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            arr[a].add(b);
            arr[b].add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        int count = 0;

        while (!q.isEmpty()) {
            int poll = q.poll();
            visited[poll] = true;
            for (int next : arr[poll]) {
                if (!visited[next]) {
                    q.add(next);
                    visited[next] = true;
                    count++;
                }
            }
        }
        System.out.println(count);

        bw.flush();
        bw.close();
        br.close();

    }
}

