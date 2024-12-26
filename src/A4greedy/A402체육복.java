package A4greedy;

import java.util.Arrays;

public class A402체육복 {
    public static void main(String[] args) {
        int n = 5;
        int answer = 0;
        int[] lost = {2,4};
        int[] reserve = {3,5};
        int[] student = new int[n+1];
        for(int i = 0;i<student.length;i++){
            student[i]=1;
        }
        for (int a : lost){
            student[a]--;
        }
        for(int a : reserve){
            student[a]++;
        }
        for (int i = 1;i<student.length+1;i++){
            if(i+1<student.length){
                if(student[i-1]<1&&student[i]>1){
                    student[i-1]++;
                    student[i]--;
                }
                if(student[i+1]<1&&student[i]>1){
                    student[i+1]++;
                    student[i]--;
                }
            }
            if(i+1==student.length){
                if(student[i-1]<1&&student[i]>1){
                    student[i-1]++;
                    student[i]--;
                }
            }
        }
        for(int i = 1;i<student.length;i++){
            if(student[i]>=1){
                answer++;
            }
        }
    }
}
