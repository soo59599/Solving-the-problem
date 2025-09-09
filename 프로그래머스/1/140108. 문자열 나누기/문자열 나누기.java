class Solution {
    public int solution(String s) {
        int answer = 0;
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 0) {
            char first = sb.charAt(0);
            int xCount = 0;
            int yCount = 0;

            int i = 0;
            for (; i < sb.length(); i++) {
                if (sb.charAt(i) == first) {
                    xCount++;
                } else {
                    yCount++;
                }

                if (xCount == yCount) {
                    break;
                }
            }

            answer++;
            sb.delete(0, i + 1);
        }

        return answer;
    }
}
