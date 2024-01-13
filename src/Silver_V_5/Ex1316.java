// 그룹 단어 체커
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[26];
        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        int before = 26;

        for (int i = 0; i < n; i++) {
            char[] words = br.readLine().toCharArray();
            for (int j = 0; j < check.length; j++) {
                check[j] = true;
            }

            for (int j = 0; j < words.length; j++) {
                int c = (int) words[j] - 97;

                if (check[c]) {
                    check[c] = false;
                } else {
                    cnt--;
                    break;
                }

                before = c;
            }
        }

        System.out.println(cnt);
    }
}
