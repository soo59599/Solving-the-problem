class Solution {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == ' ') {
                count = 0;
            } else {
                // 직접 ASCII 조작 (가장 빠름)
                if (count % 2 == 0) {
                    // 대문자로: 소문자면 -32
                    chars[i] = (c >= 'a' && c <= 'z') ? (char)(c - 32) : c;
                } else {
                    // 소문자로: 대문자면 +32  
                    chars[i] = (c >= 'A' && c <= 'Z') ? (char)(c + 32) : c;
                }
                count++;
            }
        }
        
        return new String(chars);
    }
}