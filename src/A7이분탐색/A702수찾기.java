package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A702수찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String sinput = br.readLine();
        String[] inputArray = sinput.split(" ");
        int[] arr1 = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            arr1[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(arr1);
        String m = br.readLine();
        String minput = br.readLine();
        String[] inputArray2 = minput.split(" ");
        int[] arr2 = new int[inputArray2.length];
        for (int i = 0; i < inputArray2.length; i++) {
            arr2[i] = Integer.parseInt(inputArray2[i]);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        for(int i=0; i<arr2.length; i++){
            int start = 0;
            int end = arr1.length-1;
            int index = -1;
            while (start<=end){
                int mid = (start+end)/2;
                if(arr1[mid] == arr2[i]){
                    index = mid;
                    break;
                }else if(arr1[mid] > arr2[i]){
                    end = mid-1;
                } else if (arr1[mid] < arr2[i]) {
                    start = mid+1;
                }
            }
            if(index!=-1){
                System.out.println(1);
            }else {
                System.out.println(0);
            }
        }

    }
}
