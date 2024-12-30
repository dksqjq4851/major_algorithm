package A7이분탐색;

import java.util.Arrays;

public class A701BinaryBasic2 {
    public static void main(String[] args) {
//        target이 arr에 있다면 index값 return
//        target이 arr에 없다면 있어야할 자리의 index를 return
        int[] arr = {1,3,5,7,9,11,13,15,17,19};
        int target = 2;
        int answer = -1;
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while(start<=end){
            mid = (start + end)/2;
            if(arr[mid]==target){
                answer = mid;
                break;
            }else if(arr[mid]<target){
                start = mid + 1;
            }else {
                end = mid - 1;
                answer = mid;
            }
        }
//        System.out.println(answer);
        System.out.println(Arrays.binarySearch(arr, 0));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 20));

        int answer2 = Arrays.binarySearch(arr, 30);
        if(answer2<0){
            System.out.println(Math.abs(answer2)-1);
        }else{
            System.out.println(answer2);
        }

    }
}
