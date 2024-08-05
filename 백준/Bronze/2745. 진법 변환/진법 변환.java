
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int B = sc.nextInt();
		
		int num = 0;

		for (int i = 0; i < N.length(); i++) {
			if(Character.isLetter(N.charAt(N.length()-i-1))) {
				num += (N.charAt(N.length()-i-1)-55)*Math.pow(B, i); //문자일때
			}else {
				num += (N.charAt(N.length()-i-1)-48)*Math.pow(B, i); //숫자일때
			}			
		}
		
		System.out.println(num);

	}
}
