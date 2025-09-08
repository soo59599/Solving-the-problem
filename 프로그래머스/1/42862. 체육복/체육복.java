import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] hasClothes = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            hasClothes[i] = 1;
        }
        for (int l : lost) {
            hasClothes[l] = 0;
        }
        Arrays.sort(reserve);
        
        for (int r : reserve) {
            if (hasClothes[r] == 0) {
                hasClothes[r] = 1;

            } else if (hasClothes[r] == 1) {
                hasClothes[r] = 2;
            }
        }
        for (int r : reserve) {
            if (hasClothes[r] == 2) {
                if (r - 1 >= 1 && hasClothes[r - 1] == 0) {
                    hasClothes[r - 1] = 1;
                } else if (r < n && hasClothes[r + 1] == 0) {
                    hasClothes[r + 1] = 1;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            if (hasClothes[i] == 1 || hasClothes[i] == 2) {
                answer++;
            }
        }

        return answer;
    }
}