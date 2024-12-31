package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A804적록색약 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static char[][] maps;
    static boolean[][] visited;
    static Queue<int[]> myque = new LinkedList<>();
    static int N;

    public static void main(String[] args) throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());//N초기화
        maps = new char[N][N];//맵초기화
        visited = new boolean[N][N];//비짓 초기화
        for (int i = 0; i < N; i++) {//맵에 데이터를 입력
            String temp = br.readLine();
            for (int j = 0; j <N; j++) {
                maps[i][j] = temp.charAt(j);
            }
        }
        for (int i = 0; i < N; i++) {//처음 bfs를 돌릴때는 일반인의 시선으로 카운트, 카운트하면서 bfs함수에 의해 맵의 초록색이 빨간색으로 변경
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }
        sb.append(count+" ");
        count = 0;
        visited = new boolean[N][N];//밑에서 사용하기위해 다시한번 비짓 초기화
        for (int i = 0; i < N; i++) {//변경된 맵(적록색약자가 보는 맵)에 bfs를 한번더 실행
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    count++;
                    bfs(i, j);
                }
            }
        }
        sb.append(count);
        System.out.println(sb);
    }
        public static void bfs(int x, int y){
            myque.add(new int[]{x, y});
            visited[x][y] = true;
            while (!myque.isEmpty()) {
                int[] temp = myque.poll();
                int ax = temp[0];
                int ay = temp[1];

                for (int i = 0; i < 4; i++) {
                    int nx = ax + dx[i];
                    int ny = ay + dy[i];

                    if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
                    if (visited[nx][ny] || maps[ax][ay] != maps[nx][ny]) continue;//들렀는지 확인하고 갈곳이 이전값과 다른지 확인
                    visited[nx][ny] = true;
                    myque.add(new int[]{nx, ny});
                }
                if (maps[ax][ay] == 'G')//초록색이 빨강으로 변경
                    maps[ax][ay] = 'R';
            }
    }
}
