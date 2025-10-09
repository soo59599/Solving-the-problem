import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] T = br.readLine().split(" ");
        int N = Integer.parseInt(T[0]);
        int M = Integer.parseInt(T[1]);

        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map1.put(name, i + 1);
            map2.put(i+1, name);
        }

        for (int i = 0; i < M; i++) {
            String line = br.readLine();
            if (map1.containsKey(line)) {
                bw.write(map1.get(line).toString() + "\n");
            } else {
                bw.write(map2.get(Integer.parseInt(line)) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();

    }

}

