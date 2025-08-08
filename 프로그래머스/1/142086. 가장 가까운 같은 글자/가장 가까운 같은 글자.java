import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>();
        Character findChar=0;
        for(int i = 0; i < s.length(); i++){
            findChar = s.charAt(i);
            
            if(!map.containsKey(findChar)){
                map.put(findChar, i);
                answer[i] = -1;
            }else{
                map.get(findChar);
                answer[i] =  i - map.get(findChar);
                map.put(findChar, i);
            }
        }
        return answer;
    }
}