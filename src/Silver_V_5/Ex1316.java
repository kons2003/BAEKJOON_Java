// 그룹 단어 체커
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[26]; // 전에 나온 문자인지 검사를 위한 배열
        int n = Integer.parseInt(br.readLine());
        int cnt = n; // 그룹 단어의 개수 저장 변수
        int before = 0; // 바로 전에 나온 문자 저장 변수

        for (int i = 0; i < n; i++) {
            char[] words = br.readLine().toCharArray();
            Arrays.fill(check, true);

            for (int j = 0; j < words.length; j++) {
                int c = (int) words[j] - 97;

                if (j == 0) {
                    check[c] = false;
                } else { // j >= 1
                    if (before != c) {
                        
                        if (check[c]) {
                            check[c] = false;
                        } else { // check[c] == false
                            cnt--; // 그룹 단어가 아니면 감소
                            break;
                        }
                    }
                }

                before = c; // 이전 문자 저장
            }
        }

        System.out.println(cnt);
    }
}
