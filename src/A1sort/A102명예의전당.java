package A1sort;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class A102명예의전당 {
    public static void main(String[] args) {
        int[] score = {10,100,20,150,1,100,200};
        int k = 3;
        int[] answer = new int[score.length];
        Queue<Integer>pq = new PriorityQueue<>();
        for(int i = 0; i<score.length;i++){
            if(pq.size()<k){
                pq.add(score[i]);
            }else{
                if(pq.peek()<score[i]){
                    pq.poll();
                    pq.add(score[i]);
                }
            }
            answer[i] = pq.peek();
        }
    }
}
