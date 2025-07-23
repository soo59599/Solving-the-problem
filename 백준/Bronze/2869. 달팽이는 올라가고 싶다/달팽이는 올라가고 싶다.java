
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		br.close();
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		//(a-b)*n +a >= v
		
		int day = (v-a)/(a-b)+1;
		
		if((v-a)%(a-b) !=0) {
			day++;
		}
		
		System.out.println(day);
		
		
		
	}
}