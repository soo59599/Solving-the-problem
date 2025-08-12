class Solution {
    public int solution(int a, int b, int n) {
        //빈병 a개 -> 콜라 b병, n개를 가져다 줬을때 몇병?
        int answer = col(a, b, n, 0);

        return answer;
    }

    public static int col(int a, int b, int n, int ans) {
        // a: 빈 병 교환에 필요한 개수
        // b: 교환 시 받는 콜라 개수
        // n: 현재 빈 병 개수
        // ans: 지금까지 받은 총 콜라 개수

        if (n < a) { // 더 이상 교환 불가하면 종료
            return ans;
        }

        int exchangeCount = n / a; // 교환 가능한 횟수
        int newCola = exchangeCount * b; // 이번에 새로 받은 콜라 수
        int remainder = n % a; // 교환 후 남은 빈 병 수

        ans += newCola; // 새로 받은 콜라 누적

        n = newCola + remainder; // 빈 병 수 갱신 (받은 콜라 병 + 남은 병)

        return col(a, b, n, ans);
    }
}