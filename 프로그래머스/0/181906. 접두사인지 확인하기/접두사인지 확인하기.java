class Solution {
    public int solution(String my_string, String is_prefix) {

        int len = is_prefix.length();
        if(my_string.length()<len) return 0;
        String substring = my_string.substring(0, len);
        return is_prefix.equals(substring) ? 1 : 0;
    }
}