package A8final_check;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A802A와B {
    public static void main(String[] args) throws IOException {
//        반대로 생각해서 S에서 T로 바꾸는 조건을 반대로해서 T에서 S로 바꿀수있다면 1, 아니면 0을 출력하도록 하겠습니다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder a = new StringBuilder(br.readLine());
        StringBuilder b = new StringBuilder(br.readLine());
        int answer = 0;
        while (b.length() > a.length()) {
            if (b.charAt(b.length() - 1) == 'A') { //A가 뒤에있다는것은 S에 A가 추가되었다는것을 의미, 따라서 A(마지막자리)를 삭제합니다.
                b.delete(b.length() - 1, b.length());
            } else {
                b.delete(b.length() - 1, b.length());//A가 추가되는경우 말고는 뒤집은뒤 B가 추가되는경우니 마찬가지로 B(마지막자리)를 삭제후 뒤집습니다.
                b.reverse();
            }
            if (b.length() == a.length()) {
                if (b.toString().equals(a.toString())) answer = 1;
                break;
            }
        }
        System.out.println(answer);
    }
}
