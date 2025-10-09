
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] db = br.readLine().split(" ");
        int d = Integer.parseInt(db[0]);
        int b = Integer.parseInt(db[1]);

        Map<String, Integer> map = new HashMap<>();
        List<String> dbj = new ArrayList<>();

        for (int i = 0; i < d; i++) {
            String dName = br.readLine();
            map.put(dName, 1);
        }

        for (int i = 0; i < b; i++) {
            String bName = br.readLine();
            if (map.containsKey(bName)) {
                dbj.add(bName);
            }
        }

        Collections.sort(dbj);

        bw.write(dbj.size() + "\n");
        for (String s : dbj) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }

}

