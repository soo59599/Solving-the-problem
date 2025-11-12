import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String string = br.readLine().split("\\.")[1];
            if (!map.containsKey(string)) {
                map.put(string, 1);
                list.add(string);
            } else {
                map.put(string, map.get(string) + 1);
            }
        }
        list.sort(String::compareTo);

        for (String key : list) {
            System.out.print(key + " ");
            System.out.println(map.get(key));
        }
    }

}

