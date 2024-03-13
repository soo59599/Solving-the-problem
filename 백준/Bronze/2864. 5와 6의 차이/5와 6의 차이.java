import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int minSum = Integer.parseInt(String.valueOf(A).replace('6', '5'))+Integer.parseInt(String.valueOf(B).replace('6', '5'));
		int maxSum = Integer.parseInt(String.valueOf(A).replace('5', '6'))+Integer.parseInt(String.valueOf(B).replace('5', '6'));
		
		System.out.println(minSum + " " + maxSum);
	}
}