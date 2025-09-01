import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int solution(int number, int limit, int power) {

        int[] arr = new int[number];

        for (int j = 1; j <= number; j++) {
            int count = 0;
            for (int i = 1; i * i <= j; i++) { 
                if (i * i == j) count++;
                else if (j % i == 0) count += 2;
            }
            if (count <= limit) arr[j - 1] = count;
            else arr[j - 1] = power;
        }

        int answer = Arrays.stream(arr).sum();
        return answer;
    }
}