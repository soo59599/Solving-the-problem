class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] arr = s.split(" ", -1);
        StringBuilder sb;
        for (String str : arr) {
            if (str.isEmpty()) {
                answer.append(" ");
                continue;
            }
            sb = new StringBuilder(str.toLowerCase());
            char c = sb.charAt(0);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                sb.setCharAt(0, Character.toUpperCase(c));
            }
            answer.append(" ").append(sb);
        }

        return answer.substring(1);
    }
}
