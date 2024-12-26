package A3bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class A306숨바꼭질 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputs = input.split(" ");
        int[] visited = new int[100001];
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(n);
        int answer = 0;
        while (queue.isEmpty() == false)
        {
            int temp = queue.poll();
            if (temp == k)
            {
                answer = visited[temp];
                break;
            }
            if (temp-1>=0 && visited[temp-1] == 0)
            {
                visited[temp-1] = visited[temp]+1;; ;
                queue.add(temp-1);
            }
            if (temp+1 <= 100000 && visited[temp+1] == 0)
            {
                visited[temp+1] = visited[temp]+1;
                queue.add(temp+1);
            }
            if (2*temp <= 100000 && visited[2*temp] == 0)
            {
                visited[2*temp] = visited[temp] + 1;
                queue.add(2*temp);
            }
        }
        System.out.println(answer);
    }
}
