import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Solution {
    public static int solution(String[][] clothes) {
        int answer = 1;
        Set<String> clothesType = new HashSet<String>();
        for (String[] strings : clothes) {
            clothesType.add(strings[1]);
        }

        int size = clothesType.size();
        System.out.println("size = " + size);
        int[] clothe = new int[size];

        Iterator<String> it = clothesType.iterator();
        int index = 0;

        while (it.hasNext()) {
            String type = it.next();
            System.out.println(type);
            for (String[] strings : clothes) {
                if (strings[1].equals(type)) {
                    clothe[index]++;
                }
            }
            index++;
        }

        for (int i : clothe) {
            answer *= (i + 1);
        }

        answer = answer - 1;

        return answer;
    }

}