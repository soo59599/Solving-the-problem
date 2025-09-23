import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(26, 10)));
    }


    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        //가로가 x, 세로가 y
        //갈색 크기 2x + 2y - 4
        //노랑 크기 (x-2) * (y-2) = xy -2x -2y +4 = xy - (2x + 2y -4)
        //x>=y
        // yellow = xy - brown
        // yellow + brown = xy

        int xy = brown + yellow;

        for (int x = 3; x <= xy; x++) {
            if (xy % x == 0 ) {
                int y = xy / x;
                if(x>=y && (x-2) * (y-2) == yellow){
                    answer[0] = x;
                    answer[1] = xy / x;
                    break;
                }
            }
        }
        return answer;
    }
}