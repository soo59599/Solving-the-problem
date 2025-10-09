import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Deque<String> q = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] st = br.readLine().split(" ");
            String command = st[0];

            switch (command) {
                case "push":
                    q.addLast(st[1]); // 뒤에 삽입
                    break;

                case "pop":
                    if (!q.isEmpty()) {
                        bw.write(q.pollFirst());
                    } else {
                        bw.write("-1");
                    }
                    bw.newLine();
                    break;

                case "size":
                    bw.write(String.valueOf(q.size()));
                    bw.newLine();
                    break;

                case "empty":
                    bw.write(q.isEmpty() ? "1" : "0");
                    bw.newLine();
                    break;

                case "front":
                    bw.write(q.isEmpty() ? "-1" : q.peekFirst());
                    bw.newLine();
                    break;

                case "back":
                    bw.write(q.isEmpty() ? "-1" : q.peekLast());
                    bw.newLine();
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
