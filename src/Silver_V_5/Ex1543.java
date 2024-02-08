// 문서 검색
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String word = br.readLine();

        int cnt = (s.length() - s.replace(word, "").length()) / word.length();

        System.out.println(cnt);
    }
}
