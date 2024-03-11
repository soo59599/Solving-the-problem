
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sol = 0;
		int[] time = new int[N];
		for(int i =0;i<N;i++) {
			time[i] = sc.nextInt();
		}
		Arrays.sort(time);
		for (int i = 0; i < time.length; i++) {
			time[i] = time[i]*(N-i);
		}
		
		for (int i = 0; i < time.length; i++) {
			sol += time[i];
		}
		System.out.println(sol);
	}
}