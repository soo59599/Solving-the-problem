
class Solution {
    public int[] solution(String[] park, String[] routes) {
        //s의 위치
        int[] start = new int[2];
        a:
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    start = new int[]{i, j};
                    break a;
                }
            }
        }

        String[][] arr = new String[routes.length][2];
        for (int i = 0; i < routes.length; i++) {
            arr[i] = routes[i].split(" ");
            int step = Integer.parseInt(arr[i][1]);
            boolean blocked = false;

            switch (arr[i][0]) {
                case "E":

                    //공원을 벗어나는 경우
                    if (start[1] + step >= park[0].length()) {
                        continue;
                    }

                    //장애물을 만나는 경우
                    for (int j = start[1]; j <= start[1] + step; j++) {
                        if (park[start[0]].charAt(j) == 'X') {
                            blocked = true;
                            break;
                        }
                    }

                    if (blocked) {
                        continue;
                    }

                    //좌표 갱신
                    start = new int[]{start[0], start[1] + step};
                    break;

                case "W":
                    //공원을 벗어나는 경우
                    if (start[1] - step < 0) {
                        continue;
                    }

                    //장애물을 만나는 경우
                    for (int j = start[1]; j >= start[1] - step; j--) {
                        if (park[start[0]].charAt(j) == 'X') {
                            blocked = true;
                            break;
                        }
                    }

                    if (blocked) {
                        continue;
                    }

                    //좌표 갱신
                    start = new int[]{start[0], start[1] - step};
                    break;

                case "S":

                    //공원을 벗어나는 경우
                    if (start[0] + step >= park.length) {
                        continue;
                    }

                    //장애물을 만나는 경우
                    for (int j = start[0]; j <= start[0] + step; j++) {
                        if (park[j].charAt(start[1]) == 'X') {
                            blocked = true;
                            break;
                        }
                    }

                    if (blocked) {
                        continue;
                    }

                    //좌표 갱신
                    start = new int[]{start[0] + step, start[1]};
                    break;

                case "N":
                    // 공원을 벗어나는 경우
                    if (start[0] - step < 0) {
                        continue; // 명령 무시하고 다음으로
                    }

                    // 장애물을 만나는 경우
                    for (int j = start[0]; j >= start[0] - step; j--) {
                        if (park[j].charAt(start[1]) == 'X') {
                            blocked = true;
                            break;
                        }
                    }

                    if (blocked) {
                        continue; // 명령 무시
                    }

                    // 좌표 갱신
                    start = new int[]{start[0] - step, start[1]};
                    break;
            }
        }

        return start;
    }
}