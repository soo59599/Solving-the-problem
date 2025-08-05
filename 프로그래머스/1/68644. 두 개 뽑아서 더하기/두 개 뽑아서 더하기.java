
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> setAnswer = new HashSet<>();

        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                setAnswer.add(numbers[j]+numbers[i]);
            }
        }

        int[] answer = setAnswer.stream().mapToInt(x->x).sorted().toArray();

        return answer;
    }
}
