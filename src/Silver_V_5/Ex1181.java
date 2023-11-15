// 단어 정렬
package Silver_V_5;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Ex1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 단어의 개수 n
        String[] words = new String[n]; // 단어 입력 받을 배열 공간

        // 단어의 개수만큼 단어 입력 받음
        for (int i = 0; i < n; i++) {
            words[i] = br.readLine();
        }

        // words 사전순 정렬
        Arrays.sort(words);
        // words 이름 길이순 정렬
        Arrays.sort(words, Comparator.comparing(String::length));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 정렬된 words 출력
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                bw.write(words[i]);
                bw.newLine();
            // 중복 값 제외 코드
            } else if (!(words[i].equals(words[i - 1]))) {
                bw.write(words[i]);
                bw.newLine();
            }
        }
        
        bw.flush();
        bw.close();
    }
}
