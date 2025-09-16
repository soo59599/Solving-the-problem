import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        Map<String, Integer> rank = new HashMap<>();
        for(int i = 0 ; i < players.length ; i++){
            rank.put(players[i], i);
        }
        for(String name : callings){
            int cur =rank.get(name);
            int prev = cur - 1;
            
            String temp = players[prev];
            players[prev] = players[cur];
            players[cur] = temp;
            
            rank.put(players[cur] , cur);
            rank.put(players[prev], prev);
        }
        return answer;
    }
}