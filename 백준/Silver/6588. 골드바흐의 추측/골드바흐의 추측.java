import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean[] isPrime = new boolean[1000001];

        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            boolean flag = true;
            for (int i = n; n / 2 - 1 <= i; i--) {
                if (isPrime[i]) {
                    if (isPrime[n - i]) {
                        bw.write(n + " = " + (n - i) + " + " + i + "\n");
                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                bw.write("Goldbach's conjecture is wrong.");
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }

}

