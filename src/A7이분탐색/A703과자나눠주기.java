package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A703과자나눠주기 {
//    16401
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 1;
        int end = arr[arr.length-1];
        while (start<=end){
            int mid = (start+end)/2;
            int count = 0;
            for(int i =0;i<N;i++){
                if(arr[i]>=mid){
                    count += arr[i]/mid;
                }
            }
            if(count >=M){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        System.out.println(end);
    }
}
