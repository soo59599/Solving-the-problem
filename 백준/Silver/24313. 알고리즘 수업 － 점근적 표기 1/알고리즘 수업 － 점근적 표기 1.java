import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int a1 = Integer.parseInt(str.split(" ")[0]);
        int a0 = Integer.parseInt(str.split(" ")[1]);
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());
        
        if (a1 > c) {
            System.out.println(0);
        } else if (a1 * n0 + a0 <= c * n0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

}
