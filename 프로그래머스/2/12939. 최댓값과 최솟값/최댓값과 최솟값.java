import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        List<Integer> list = new ArrayList<>();
        
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken())) ;
        }
        int max = list.stream().max(Integer::compareTo).get();
        int min = list.stream().min(Integer::compareTo).get();

        return min + " " + max;
    }
}