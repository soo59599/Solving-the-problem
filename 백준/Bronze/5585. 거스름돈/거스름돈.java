import java.util.Scanner;

public class Main {// 브론즈
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int M = 1000 - sc.nextInt();
		int A = 0;
		int change[] = {500,100,50,10,5,1};
		for(int arr : change) {
			A += M/arr;
			M %= arr;
		}
		
		System.out.println(A);
	}
}
