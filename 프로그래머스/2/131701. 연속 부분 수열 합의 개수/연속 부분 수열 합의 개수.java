import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int[] arr = new int[elements.length * 2 + 1];

        for (int i = 1; i < elements.length * 2; i++) {
            arr[i] = arr[i - 1] + elements[(i - 1) % elements.length];
        }
        
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                set.add(arr[i+j]-arr[i]);
            }
        }
        
        answer = set.size();
        
        return answer;
    }
}