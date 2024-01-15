// 농구 경기
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphabet = new int[26];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char name = br.readLine().charAt(0); // 첫 글자 저장
            alphabet[(int) name - 97] += 1; // 해당 알파벳 중복 수 카운트
        }

        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alphabet[i] >= 5) {
                sb.append((char) (i + 97));
                flag = true;
            }
        }

        if (flag) {
            System.out.println(sb);
        } else {
            System.out.println("PREDAJA");
        }
    }
}
