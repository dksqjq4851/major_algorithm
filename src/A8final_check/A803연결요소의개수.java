package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A803연결요소의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());//정점의 개수
        int M = Integer.parseInt(st.nextToken());//간선의 개수
        int[][] arr = new int[M][2];
        boolean[] visited = new boolean[N+1];
        int count = 0; //연결요소의 개수를 구하는 변수 선언.
        for(int i = 0; i<M;i++){//입력된 간선을 배열화
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0 ;i <N+1; i++){//정점의 개수만큼 빈 리스트 생성
            adjList.add(new ArrayList<>());
        }
        for(int[] a : arr){
//            a[0] -> a[1] 단방향의 경우
            adjList.get(a[0]).add(a[1]);
//            양방향의 경우
            adjList.get(a[1]).add(a[0]);
        }
        System.out.println(adjList);
        for(int i = 1; i < N+1;i++){
            if(!visited[i]){//for문을 돌때 안간곳만 확인해서dfs 실행 -> 연결요소 갯수구하기
                dfs(adjList, visited, i);
                count++;
            }
        }
        System.out.println(count);

    }
    static void dfs(List<List<Integer>> adjList, boolean[] vistied, int start){
        vistied[start] = true;
        for(int a : adjList.get(start)){
            if(vistied[a]==false){
                dfs(adjList,vistied,a);
            }
        }
    }
}