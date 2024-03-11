
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		for (int i = 0; i < N; i++) {
			String word = sc.next();
			boolean groupWord = true;
			boolean visit[] = new boolean[26];
			char preChar = word.charAt(0);
			visit[word.charAt(0) - 'a'] = true;
			for (int j = 1; j < word.length(); j++) {
				char curChar = word.charAt(j);
				if (preChar == curChar) {
					continue;
				}
				if (visit[curChar - 'a']) {
					groupWord = false;
					break;
				}
				visit[curChar - 'a'] = true;
				preChar = curChar;
			}
			if (groupWord) {
				count++;
			}
		}
		System.out.println(count);
	}
}
