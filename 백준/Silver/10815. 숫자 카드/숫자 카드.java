
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] card1 = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        String[] card2 = br.readLine().split(" ");

        Set<String> set1 = new HashSet<>();
        for (String card : card1) {
            set1.add(card);
        }
        for (String card : card2) {
            if (set1.contains(card)) {
                bw.write("1 ");
            } else {
                bw.write("0 ");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
