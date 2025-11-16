import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            String key = st.nextToken();
            int value = Integer.parseInt(st.nextToken());
            map.put(key, map.getOrDefault(key, 0) + value);
        }

        boolean flag = true;
        for (int value : map.values()) {
            if (value == 5) {
                flag = false;
                break;
            }
        }

        if (!flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

