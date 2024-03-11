
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int count = 0;
		boolean[][] wPaper = new boolean[100][100];

		for (int i = 0; i < Num; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int j = x; j < x + 10; j++) {
				for (int k = y; k < y + 10; k++) {
					wPaper[j][k] = true;
				}
			}
		}

		for (int i = 0; i < wPaper.length; i++) {
			for (int j = 0; j < wPaper.length; j++) {
				if (wPaper[i][j] == true) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
