package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class A801카드정렬하기 {
    public static void main(String[] args) throws IOException {
//        입력 받아오기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        int answer = 0;

//        입력 받은 값을 pq를 통해 저장
        Queue<Integer> myque = new PriorityQueue();
        for(int i = 0;i<N;i++){
            int a = Integer.parseInt(br.readLine());
            myque.add(a);
        }
        while(!myque.isEmpty()){
            if(myque.isEmpty())break; //pq에서 값을 꺼내오기전에 비어있는지 확인후 꺼내오기.
            int a = myque.poll();
            if(myque.isEmpty())break; //pq에서 값을 꺼내오기전에 비어있는지 확인후 꺼내오기.
            int b = myque.poll();
            total = a + b;
            answer += total;
            myque.add(total);
        }
        System.out.println(answer);
    }
}
