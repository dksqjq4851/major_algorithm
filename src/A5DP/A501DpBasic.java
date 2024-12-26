package A5DP;

import java.util.Arrays;

public class A501DpBasic {
    public static void main(String[] args) {
//        1,4,5로 13을 만들수 있는 조합중에 가장 작은 조합의 개수
//        greedy로 풀경우 : 5개(5*2 + 1*3)
//        dfs, bfs 로 풀경우 일반적으로 시간초과 나도록 설계.

//        dp로 풀경우 :3개(4*2 + 5*1)
//        min(f(n-1), f(n-2) ...) +1
        int target = 13;
        int[] numbers = {1,4,5};
        int[] answer = new int[target+1];
        answer[1] = 1;
        for(int i = 2;i<answer.length;i++){
            int min = Integer.MAX_VALUE;
            for(int n : numbers){
                if(i-n>=0 && min>answer[i-n]){
                    min = answer[i-n];
                }
            }
            answer[i] = min+1;
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(answer[target]);
    }

}
