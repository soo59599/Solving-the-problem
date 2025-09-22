class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        int answer = 0;
        
        //가장 긴 변이 주어진 경우
        for(int i = 1 ; i<=max ; i++){
            if(i+min>max){
                answer++;
            }
        }
        
        //나머지 한 변이 가장 긴 경우
        for(int i = max + 1 ; i<max+min ; i++){
            if(max+min>i){
                answer++;
            }
        }
        
        return answer;
    }
}