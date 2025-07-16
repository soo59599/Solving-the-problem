import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        int[] b = {-1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if(list.size() > 0) {
            int[] answer = new int[list.size()];
            list.sort(Comparator.naturalOrder());
            for(int i = 0; i < list.size(); i++) {
               answer[i] = list.get(i);
           }
            return answer;
        }
        return b;
    }
}