class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int bigNum = 0;
        int smallNum = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                if (sizes[i][0] > bigNum) {
                    bigNum = sizes[i][0];
                }
                if (sizes[i][1] > smallNum) {
                    smallNum = sizes[i][1];
                }
            } else {
                if (sizes[i][1] > bigNum) {
                    bigNum = sizes[i][1];
                }
                if (sizes[i][0] > smallNum) {
                    smallNum = sizes[i][0];
                }
            }
        }

        answer = (bigNum * smallNum);

        return answer;
    }
}
