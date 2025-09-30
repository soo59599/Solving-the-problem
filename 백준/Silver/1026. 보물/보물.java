import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        String[] A = br.readLine().split(" ");
        String[] B = br.readLine().split(" ");

        Integer[] a = Arrays.stream(A).map(Integer::parseInt).toArray(Integer[]::new);
        Integer[] b = Arrays.stream(B).map(Integer::parseInt).toArray(Integer[]::new);

        Arrays.sort(a, Comparator.reverseOrder());
        Arrays.sort(b);

        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = ans + a[i] * b[i];
        }

        System.out.println(ans);

        bw.flush();
        bw.close();
        br.close();

    }

}

