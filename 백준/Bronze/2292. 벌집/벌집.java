import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int i = 1;

        while (3*i*(i -1)+1<N){
            i++;
        }

        System.out.println(i);
    }
}