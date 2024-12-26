package A4greedy;

import java.util.Arrays;

public class A403구명보트 {
    public static void main(String[] args) {
        int[] people = {70,50,80,50,60,90,45,55,75};
        int limit = 100;
        int answer = 0;
        int couple = 0;
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int small = 0;
        int big = people.length - 1;
        while (small < big) {
            if (people[small] + people[big] <= limit) {
                small++;
                big--;
                couple++;
            } else {
                big--;
            }
        }
        answer = people.length - couple;
        System.out.println(answer);
    }
}
