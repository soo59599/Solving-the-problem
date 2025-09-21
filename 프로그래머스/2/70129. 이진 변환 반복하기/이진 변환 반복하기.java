class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String binaryString = s;

        while (true) {

            //0 갯수 세기
            for (int i = 0; i < binaryString.length(); i++) {
                if (binaryString.charAt(i) == '0') {
                    answer[1]++;
                }
            }

            //0 제거
            int length = binaryString.replace("0", "").length();
            
            if (binaryString.length() == 1) {
                break;
            }
            answer[0]++;

            //이진 변환
            binaryString = Integer.toBinaryString(length);
        }

        return answer;
    }
}