package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A806나무자르기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken());//문제의 범위에 맞기 타입을 설정
        long[] tree = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(tree);
        long start = 1;
        long end = tree[tree.length - 1];
        while (start <= end) {
            long mid = (start + end) / 2;
            long total = 0;
            for (int i = 0; i < tree.length; i++) {//톱으로 베인 나무들의 숫자를 total에 저장
                if (tree[i] - mid >= 0) {//tree[i]가 mid 보다 크다는건 자를수있는 나무라는것
                    total += Math.abs(mid - tree[i]);

                }
            }
            if (total >= M) {//잘린나무가 요구치보다 많다면 더 조금만 잘라야한다.
                start = (mid + 1);
            } else{//잘린나무가 요구치보다 적으면 더 많이 잘라야 한다.
                end = (mid - 1);
            }

        }
        System.out.println(end);
    }
}
