// 그룹 단어 체커
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] words = new char[26];
        boolean[] check = new boolean[26];
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            words = br.readLine().toCharArray();

            for (int j = 0; j < words.length; j++) {
                check[i] = true;
            }
        }
    }
}
