import java.util.Scanner;

class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(c->c-'0').sum();
        return x % sum == 0;
    }
}