import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        // Bottom-Up 방식으로 변경
        bw.write(sol(num) + "");

        br.close();
        bw.close();
    }

    public static int sol(int num) {
        if (num == 1) return 0;
        
        int[] dp = new int[num + 1];
        dp[1] = 0;

        // 2부터 num까지 차례대로 계산 (Bottom-Up)
        for (int i = 2; i <= num; i++) {
            // 1 빼기 (항상 가능)
            dp[i] = dp[i - 1] + 1;

            // 2로 나누기 (2의 배수일 때)
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 나누기 (3의 배수일 때)
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        return dp[num];
    }
}