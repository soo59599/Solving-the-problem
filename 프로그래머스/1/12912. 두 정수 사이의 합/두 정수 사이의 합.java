import java.util.Scanner;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int bigger = 0;
        int smaller = 0;
        
        if(a == b){
            answer = a;
        }else if(a < b){
            bigger = b;
            smaller = a;
        }else{
            bigger = a;
            smaller = b;
        }
        for(int i = smaller ; i<=bigger; i++ ){
            answer += i;
        }
        
        return answer;
    }
}