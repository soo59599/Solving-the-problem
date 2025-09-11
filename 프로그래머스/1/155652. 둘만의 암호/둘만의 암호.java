class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        boolean[] str = new boolean[26];

        for (char c : skip.toCharArray()) {
            str[c - 'a'] = true;
        }

        for (char c : s.toCharArray()) {
            int current = c - 'a';
            int nextIndex = 0;
            int count = 0;

            while (count < index) {
                nextIndex++;
                if (!str[(current + nextIndex) % 26]) {
                    count++;
                }
            }

            answer.append((char)((current + nextIndex) % 26 + 'a'));
        }

        return answer.toString();
    }
}
