// 하얀 칸
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String wStart = "WBWBWBWB";
        String bStart = "BWBWBWBW";
        char[][] board = new char[8][8];
        char[][] chess = new char[8][8];

        // board 초기화
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                board[i] = wStart.toCharArray();
            } else {
                board[i] = bStart.toCharArray();
            }
        }

        // chess 입력
        for (int i = 0; i < 8; i++) {
            chess[i] = br.readLine().toCharArray();
        }

        int cnt = 0;

        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if (board[i][j] == 'W' && chess[i][j] == 'F')
                    cnt++;

        System.out.println(cnt);
    }
}
