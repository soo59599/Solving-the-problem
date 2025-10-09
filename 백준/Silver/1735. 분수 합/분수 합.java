import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] a = br.readLine().split(" ");
        String[] b = br.readLine().split(" ");

        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);

        int b1 = Integer.parseInt(b[0]);
        int b2 = Integer.parseInt(b[1]);

        int i = a1 * b2 + b1 * a2;
        int j = a2 * b2;

        int min = Math.min(i, j);

        for (int k = min; k > 1; k--) {
            if (i % k == 0 && j % k == 0) {
                i = i / k;
                j = j / k;
                break;
            }
        }

        bw.write(i + " " + j + "\n");

        bw.flush();
        bw.close();
        br.close();

    }

}

