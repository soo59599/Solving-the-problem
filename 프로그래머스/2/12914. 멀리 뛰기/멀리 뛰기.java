class Solution {

    public static int[] jumps = new int[2001];

    public long solution(int n) {

        return jumping(n);
    }

    public long jumping(int n) {
        jumps[1] = 1;
        jumps[2] = 2;

        for (int i = 3; i <= n; i++) {
            jumps[i] = (jumps[i - 1] + jumps[i - 2])%1234567;
        }

        return jumps[n];

    }
}