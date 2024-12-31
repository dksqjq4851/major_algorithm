package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A805좋다 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int count = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); //투포인터를 사용하기위해 입력한배열을 정렬
        for(int i = 0;i<arr.length;i++) {
            int start = 0;
            int end = arr.length - 1;
            while (true) {
                if (start == i) {//검사할곳이 시작점과 같다면 시작점을 한칸앞으로
                    start++;
                } else if (end == i) {//검사할곳이 끝나는 지점과 같다면 끝나는점을 한칸뒤로
                    end--;
                }
                if (start >= end) break;
                if (arr[start] + arr[end] > arr[i]) end--;
                else if (arr[start] + arr[end] < arr[i]) start++;
                else {//좁혀나가면서 계산하다 arr[start] + arr[end]가 a[i]가 되는경우 좋은 수가되면 while 문 종료
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
