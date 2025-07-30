class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i] != ' ') {
                if ('A' <= charArray[i] && charArray[i] <= 'Z') {
                    charArray[i] = (char)((charArray[i]-'A'+n)%26+'A');
                }

                if ('a' <= charArray[i] && charArray[i] <= 'z'){
                    charArray[i] = (char)((charArray[i]-'a'+n)%26+'a');
                }
            }
        }
        answer = new String(charArray);
        System.out.println(answer);
        return answer;
    }
}