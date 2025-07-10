
import java.util.Scanner;

class Solution {
    public long solution(long n) {
        long answer =0;

        if(n==1){
            return 4;
        } else{
            for(int i = 1; i < n/2; i++) {
                if(n % i == 0) {
                    if (n / i == i) {
                        answer = i;
                        return (answer+1)*(answer+1);
                    }
                }
            }
        }
        return -1;
    }
}