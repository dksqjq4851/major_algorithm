package A3bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        DFS 와 BFS

//        static boolean[] booleans;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int[][] edge = new int[m][2];
        List<List<Integer>> myList = new ArrayList<>();
        for(int i = 0;i<m;i++){
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st1.nextToken());
            int y = Integer.parseInt(st1.nextToken());
            edge[i][0] = x;
            edge[i][1] = y;
        }
        for(int i = 0 ; i<n+1; i++){
            myList.add(new ArrayList<>());
        }
        for(int[] a : edge){
            myList.get(a[0]).add(a[1]);
            myList.get(a[1]).add(a[0]);
        }
        System.out.println(myList);
    }
    static void dfs(List<List<Integer>> myList, boolean[] vistied, int start){

    }

}
