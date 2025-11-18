
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());

        String num = A * B * C + "";
        String[] nums = num.split("");

        int[] arr = new int[10];

        int index = 0;

        while (index < nums.length) {
            int i = Integer.parseInt(nums[index]);
            arr[i]++;
            index++;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

}

