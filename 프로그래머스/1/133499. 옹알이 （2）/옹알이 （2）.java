class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String temp;
        String[] words = {"aya", "ye", "woo", "ma"};

        for (String b : babbling) {
            temp = b;
            boolean flag = true;
            for (String w : words) {
                if (temp.contains(w + w)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (String w : words) {
                    temp = temp.replace(w, " ");
                }
                temp = temp.replace( " ", "");
            }
            if (temp.isEmpty()) {
                answer++;
            }
        }

        return answer;
    }
}
