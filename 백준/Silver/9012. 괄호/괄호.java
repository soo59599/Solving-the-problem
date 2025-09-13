
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            char[] charArray = str.toCharArray();
            boolean flag = true;

            for (char c : charArray) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            bw.write((flag && stack.isEmpty() ? "YES" : "NO")+"\n");
            stack.clear();
            
        }

        bw.flush();
        bw.close();
        br.close();

    }

}

