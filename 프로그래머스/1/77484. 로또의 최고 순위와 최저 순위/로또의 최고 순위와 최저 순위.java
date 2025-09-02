import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
		int win = 0;
        Integer[] win_nums_Integer = Arrays.stream(win_nums).boxed().toArray(Integer[]::new);
        Set<Integer> winNum = new HashSet<>(Arrays.asList(win_nums_Integer)); 
        for (int i = 0; i < 6; i++) {
			if(lottos[i]==0) {
				zero++;
				continue;
			}
			if(winNum.contains(lottos[i])) {
				win++;
			}
		}
        int lose = (7-win);
        int winner = (7-(win+zero));
        if(zero==6){
            lose = 6;
        }
        if((7-(win+zero))==7){
            winner = 6;
        }
        if(lose==7){
            lose = 6;
        }
        int[] answer = {winner,lose};
        return answer;
    }
}