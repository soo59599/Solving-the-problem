import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] answers) {

        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int supo4 = 0;
        int supo5 = 0;
        int supo6 = 0;

        for(int i=0;i<answers.length;i++){
            if(answers[i]==supo1[i%supo1.length]){
                supo4++;
            }
            if(answers[i]==supo2[i%supo2.length]){
                supo5++;
            }
            if(answers[i]==supo3[i%supo3.length]){
                supo6++;
            }
        }

        int supo7 = Math.max(supo4, Math.max(supo5, supo6));

        ArrayList<Integer> supo = new ArrayList<>();

        if(supo4==supo7){
            supo.add(1);
        }
        if(supo5==supo7){
            supo.add(2);
        }

        if (supo6==supo7){
            supo.add(3);
        }

        int[] answer = supo.stream().mapToInt(Integer::valueOf).toArray();

        return answer;
    }
}