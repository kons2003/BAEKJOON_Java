// 영화감독 숌
package Silver_V_5;

import java.io.*;

public class Ex1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int numberOfApocalypse = 0; // 종말의 수 저장 공간
        int cnt = 0; // 종말의 수 나올 때마다 + 1
        int n = Integer.parseInt(br.readLine());

        while (cnt != n) {

            numberOfApocalypse++;

            // numberOfApocalypse에 "666" 문자열을 포함하면 cnt증가
            if (String.valueOf(numberOfApocalypse).contains("666")) {
                cnt++;
            }
        }

        bw.write(String.valueOf(numberOfApocalypse));

        bw.flush();
        bw.close();
    }
}
