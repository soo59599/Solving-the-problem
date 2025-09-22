class Solution {

    public static long[] fibo = new long[100001];

    public long solution(int n) {
        return fibonacciAnswer(n);
    }

    public static long fibonacciAnswer(int n) {
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] % 1234567 + fibo[i - 2] % 1234567;
        }
        return fibo[n] % 1234567;
    }
}