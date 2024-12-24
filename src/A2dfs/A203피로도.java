package A2dfs;

public class A203피로도 {
    static boolean[] visited;
    static int answer;
    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        visited = new boolean[dungeons.length];
        dfs(0, k, dungeons);
        System.out.println(answer);
    }
    static void dfs(int depth, int k, int[][] dungeons){
        for(int i = 0; i<dungeons.length;i++){
            if(!visited[i] && dungeons[i][0]<=k){
                visited[i] = true;
                dfs(depth +1, k-dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }
}
