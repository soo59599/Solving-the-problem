import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static int[] dp = new int[46];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        bw.write(fibo(T) + "\n");

        bw.flush();
        bw.close();
        br.close();

    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = fibo(n - 1) + fibo(n - 2);
    }
}

