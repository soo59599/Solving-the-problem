import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] string = br.readLine().split(" ");
        int n = Integer.parseInt(string[0]);
        int m = Integer.parseInt(string[1]);

        int i = n * m;
        double j = (i * 5) / 10.0;
        System.out.println(j);

        bw.flush();
        bw.close();
        br.close();

    }
}
