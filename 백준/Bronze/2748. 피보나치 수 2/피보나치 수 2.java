import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static long[] dp = new long[91];

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(sol(n)));

        br.close();
        bw.close();

    }

    public static long sol(int N){
        if(N == 0) return 0;
        if(N==1) return 1;

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=N;i++){
            dp[i] = dp[i-1] + dp[i-2] ;
        }

        return  dp[N];
    }
}
