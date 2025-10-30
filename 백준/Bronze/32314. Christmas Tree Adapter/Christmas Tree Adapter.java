import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int answer = 0;

        Integer a = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            Integer b = Integer.parseInt(st.nextToken());
            Integer c = Integer.parseInt(st.nextToken());

            if (a <= b / c) {
                answer = 1;
            }
        }
        System.out.println(answer);

        bw.flush();
        bw.close();
        br.close();
    }

}

