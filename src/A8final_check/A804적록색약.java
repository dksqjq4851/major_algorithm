package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class A804적록색약 {
    public static void main(String[] args) throws IOException {
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        Queue<int[]> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] maps = new String[N][N];
        boolean[][] visited = new boolean[N][N];
        for (int i = 0; i<N;i++){
            String input = br.readLine();
            for (int j = 0; j<N;j++){
                maps[i][j] = String.valueOf(input.charAt(j));
            }
        }
        queue.add(new int[]{0,0});
        while(!queue.isEmpty()){
            int[] temp = queue.poll();
            int x = temp[0];
            int y = temp[1];
            for(int i = 0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx>=0 && ny>=0 && nx<maps[0].length && ny< maps.length){
                    if(maps[ny][nx].equals('R')){
                        queue.add(new int[]{ny, nx, temp[2]+1});
//                        maps[ny][nx] = -1;
//                        if(nx==maps[0].length-1 && ny==maps.length-1){
//                            answer = temp[2] +1;
//                            break;
                        }
                    }
                }
            }

        }
    }
//}
