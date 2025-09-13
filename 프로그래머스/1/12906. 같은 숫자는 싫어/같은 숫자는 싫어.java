import java.util.*;

    public class Solution {
        public int[] solution(int[] arr) {
            ArrayDeque<Integer> stack = new ArrayDeque<>();

            stack.push(arr[0]);

            for (int i = 1; i < arr.length; i++) {
                if (stack.peek().equals(arr[i])) {
                    continue;
                }
                stack.push(arr[i]);
            }

            int[] array = new int[stack.size()];
            for(int i = array.length-1; i >= 0; i--){
                array[i] = stack.pop();
            }

            return array;
        }
    }