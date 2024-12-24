package A3bfs;

import java.util.*;

public class A304가장먼노드 {
    public static void main(String[] args) {
        int n = 6;
        int[][] edge ={{3,6},{4,3},{3,2},{1,3},{1,2},{2,4},{5,2}};
        List<List<Integer>> adjList = new ArrayList<>();
        int[] distance = new int[n+1];
        for(int i =0 ; i<n+1;i++){
            adjList.add(new ArrayList<>());
        }
        for(int[] a : edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
        for(List<Integer> a : adjList){
            a.sort(Comparator.naturalOrder());
        }
        boolean[] visited = new boolean[n+1];
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        visited[1] = true;
        while(!myQueue.isEmpty()){
            int temp = myQueue.poll();
            System.out.println(temp);
            for(int target : adjList.get(temp)){
                if(!visited[target]){
                    myQueue.add(target);
                    visited[target] = true;
                    distance[target] = distance[temp]+1;
                }
            }
        }
        int max_distance = Arrays.stream(distance).max().getAsInt();
        int answer = (int)Arrays.stream(distance).filter(a->a==max_distance).count();
//        for(int i = 0;i<distance.length;i++){
//            if(max_distance>=distance[i]){
//                answer = answer+1;
//            }else{
//                max_distance = distance[i];
//                answer = 1;
//            }
//        }
        System.out.println(answer);
    }
}
