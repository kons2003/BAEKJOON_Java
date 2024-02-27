// 누울 자리를 찾아라
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[][] map = new char[n][n];
        int width = 0; // 가로 개수
        int length = 0; // 세로 개수

        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n; i++) {
            int widthCheck = 0, lengthCheck = 0;

            for (int j = 0; j < n; j++) {
                // 가로 체크
                if (map[i][j] == '.') widthCheck++;
                if (map[i][j] == 'X' || (j == n - 1)) {
                    if (widthCheck >= 2) width++;
                    widthCheck = 0;
                }

                // 세로 체크
                if (map[j][i] == '.') lengthCheck++;
                if (map[j][i] == 'X' || (j == n - 1)) {
                    if (lengthCheck >= 2) length++;
                    lengthCheck = 0;
                }
            }
        }

        System.out.println(width + " " + length);
    }
}
