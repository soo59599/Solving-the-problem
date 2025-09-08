class Solution {
    public String solution(String X, String Y) {
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        for (char x : X.toCharArray()) {
            arrX[x - '0']++;
        }
        for (char y : Y.toCharArray()) {
            arrY[y - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while(arrX[i] > 0 && arrY[i] > 0) {
                sb.append(i);
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        if (sb.length() == 0) {
            return "-1";
        }
        if (sb.charAt(0) == '0') {
            return "0";
        }
        return sb.toString();

    }
}