import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        int[] answer = Arrays.stream(arr).filter(x->x!=min).toArray();
        if(answer.length==0) {
            return new int[]{-1};
        }

        return answer;
    }
}