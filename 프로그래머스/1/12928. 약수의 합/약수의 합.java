class Solution {
    public int solution(int n) {
        int sum = 0; // 약수들의 합을 저장할 변수 초기화

        // 1부터 n까지 반복하면서 약수를 찾아요
        for (int i = 1; i <= n; i++) {
            // 만약 i가 n의 약수라면 (n을 i로 나누었을 때 나머지가 0이라면)
            if (n % i == 0) {
                sum += i; // sum에 i를 더해요
            }
        }

        return sum; // 계산된 약수들의 합을 반환해요
    }
}