package A1sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class A103야근지수 {
    public static void main(String[] args) {
        int[] works = {4,4,3};
        int n = 4;
        long answer = 0;
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int a : works){
            pq.add(a);
        }
        while(n>0){
            int work = pq.poll();
            if(work == 0)break;
            work -= 1;
            pq.add(work);
            n--;
        }
        for(int a : pq){
            answer += a*a;
        }
        }

}
