import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder num = new StringBuilder();
        char i;
        while (N>=B){
            if(N%B>=10){
                i = (char)(N % B + 55);
            }else{
                i = (char)(N % B + 48);
            }
            num.insert(0, i);
            N = N/B;
        }
        if(N%B>=10){
            i = (char)(N % B + 55);
        }else{
            i = (char)(N%B + 48);
        }
        num.insert(0, i);

        System.out.println(num);
    }
}