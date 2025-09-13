import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Deque<Integer> stack = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            if (a.equals("push")) {
                int b = Integer.parseInt(st.nextToken());
                stack.push(b);
            }
            if (a.equals("top")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.peek() + "\n");
                }
            }
            if (a.equals("pop")) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            }
            if (a.equals("size")) {
                bw.write(stack.size() + "\n");
            }
            if (a.equals("empty")) {
                boolean empty = stack.isEmpty();
                if (empty) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}

