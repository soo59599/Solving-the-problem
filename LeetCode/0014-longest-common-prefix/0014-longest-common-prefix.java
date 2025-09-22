class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder string = new StringBuilder();
        int len = 200;
        for (String s : strs) {
            len = Math.min(len, s.length());
        }

        char[] charArray = strs[0].toCharArray();

        a: for (int i = 0; i < len; i++) {
            for (String s : strs) {
                if (s.charAt(i) != charArray[i]) {
                    break a;
                }
            }
            string.append(charArray[i]);
        }

        return string.toString();

    }
}