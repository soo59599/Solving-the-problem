
import java.util.Scanner;

class Solution {
    public int solution(long num) {
        {
            int count = 0;

            while (num != 1) {
                // 500번 수행했을 경우
                if (count == 500) {
                    count = -1;
                    break;
                }

                num = num % 2 == 0 ? num / 2 : num * 3 + 1;

                count++;
            }

            return count;
        }
    }
}
