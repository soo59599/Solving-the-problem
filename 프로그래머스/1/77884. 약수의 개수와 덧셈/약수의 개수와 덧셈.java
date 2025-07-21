import java.util.Scanner;

class Solution {

    public int countDivisors(int n){
        int count = 1;
        int temp = n;

        for(int i = 2; i*i<=n; i++) {
            int exponent = 0;

            while(temp%i == 0) {
                exponent++;
                temp /= i;
            }
            if(exponent>0){
                count *= (exponent+1);
            }
        }

        if(temp>1){
            count *=2;
        }
        return count;
    }

    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            if(countDivisors(i)%2 ==0){
                answer += i;
            }else{
                answer -=i;
            }
        }
        
        return answer;
    }
}
