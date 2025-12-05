import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int T0 = 0; T0 < T; T0++) {
            int answer = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] field = new int[N][M];
            boolean[][] visited = new boolean[N][M];
            int K = Integer.parseInt(st.nextToken());
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }
            for (int x = 0; x < N; x++) {
                for (int y = 0; y < M; y++) {
                    if (field[x][y] == 1 && !visited[x][y]) {
                        dfs(field, visited, x, y, N, M);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    public static void dfs(int[][] field, boolean[][] visited, int x, int y, int N, int M) {
        visited[x][y] = true;
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        for (int dir = 0; dir < 4; dir++) {
            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                continue;
            }
            if (field[nx][ny] == 1 && !visited[nx][ny]) {
                dfs(field, visited, nx, ny, N, M);
            }
        }

    }
}

