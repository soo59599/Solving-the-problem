class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int f = arr1.length;
        int s = arr2.length;
        int t = arr2[0].length;
        int[][] answer = new int[f][t];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < s; j++) {
                for (int k = 0; k < t; k++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
        }

        return answer;
    }
}