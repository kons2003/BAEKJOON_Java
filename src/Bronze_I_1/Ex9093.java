// 단어 뒤집기
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String[] s = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            StringBuilder reverseSb = new StringBuilder();
            
            for (int j = 0; j < s.length; j++) {
                reverseSb.append(s[j]).reverse(); // 단어마다 뒤집기
                sb.append(reverseSb).append(" "); // 뒤집힌 단어 문장으로 저장
                reverseSb.delete(0, reverseSb.length()); // reverseSb 초기화
            }

            System.out.println(sb);
        }
    }
}
