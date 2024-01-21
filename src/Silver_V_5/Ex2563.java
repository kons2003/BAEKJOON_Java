// 색종이
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] board = new int[100][100];
        int n = Integer.parseInt(br.readLine()); // 색종이 수

        // board 이차원 배열 0으로 초기화
        for (int i = 0; i < 100; i++) {
            Arrays.fill(board[i], 0);
        }

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken()); // 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리
            int y = Integer.parseInt(st.nextToken()); // 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리

            for (int length = y; length < y+10; length++)
                for (int width = x; width < x+10; width++)
                    board[length][width] = 1;
        }

        // 검은 영역 넓이 구하기
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += Arrays.stream(board[i]).sum();
        }

        System.out.println(sum);
    }
}
