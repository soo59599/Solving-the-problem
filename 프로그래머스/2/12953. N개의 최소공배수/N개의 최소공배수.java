import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        return Arrays.stream(arr).reduce(1, (a, b) -> a / gcd(a, b) * b);
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}