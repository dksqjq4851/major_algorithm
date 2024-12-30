package A6투포인터;

public class A603숫자의표현 {
    public static void main(String[] args) {
        int n = 9;
        int answer = 0;
        for(int i = 1; i<=n ;i++){
            int a = 0;
            for(int j = i;j<=n;j++){
                a += j;

                if(a == n){
                    answer++;
                    break;
                }
                if(a>n)break;
            }

        }
        System.out.println(answer);

    }
}
