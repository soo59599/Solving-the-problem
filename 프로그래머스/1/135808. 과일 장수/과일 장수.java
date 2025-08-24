import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score); // 오름차순 정렬
        int answer = 0;
        int n = score.length;

        // 뒤에서부터 m개씩 그룹
        for (int i = n - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}