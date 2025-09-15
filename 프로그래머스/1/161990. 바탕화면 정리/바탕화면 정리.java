
public class Solution {

    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        lux:
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[0] = i;
                    break lux;
                }
            }
        }

        rdx:
        for (int i = wallpaper.length - 1; i >= 0; i--) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[2] = i + 1;
                    break rdx;
                }
            }
        }

        luy:
        for (int j = 0; j < wallpaper[0].length(); j++) {
            for (int i = 0; i < wallpaper.length; i++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[1] = j;
                    break luy;
                }
            }
        }

        rdy:
        for (int j = wallpaper[0].length() - 1; j >= 0; j--) {
            for (int i = 0; i < wallpaper.length; i++) {
                if (wallpaper[i].charAt(j) == '#') {
                    answer[3] = j + 1;
                    break rdy;
                }
            }
        }

        return answer;
    }
}