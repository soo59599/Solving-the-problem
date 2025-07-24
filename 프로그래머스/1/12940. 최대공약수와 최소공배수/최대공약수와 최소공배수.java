class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int min = Math.min(n, m);
        int max = Math.max(n, m);
        
        int gcd = 1;
        
        for(int i = 1; i <= min; i++) {
            if(min%i ==0 && max%i ==0){
                gcd = i;
            }
        }

        answer[0] = gcd;
        answer[1] = n*m/gcd;
        return answer;
    }
}