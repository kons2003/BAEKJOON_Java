// 마인크래프트
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
(2초) 1.좌표 (i, j)의 가장 위에 있는 블록을 제거하여 인벤토리에 넣는다.
(1초) 2.인벤토리에서 블록 하나를 꺼내어 좌표 (i, j)의 가장 위에 있는 블록 위에 놓는다.
 */
public class Ex18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로
        int b = Integer.parseInt(st.nextToken()); // 인벤토리 안에 블록 개수

        int[][] arr = new int[n][m]; // 주어진 땅 저장 배열
        int time1 = 0; // 1번 작업 시간
        int time2 = 0; // 2번 작업 시간
        int totalTime = 0; // 1번, 2번의 작업 시간을 합한 시간
        int minHeight = 501; // 주어진 땅의 최소 높이
        int maxHeight = 0; // 주어진 땅의 최고 높이
        int height = 0; // 답중 가장 높은 땅의 높이
        int cnt = 0; // 작업할 블록 개수

        for (int i = 0; i < n; i++) { // n
            for (int j = 0; j < m; j++) { // m

                arr[i][j] = Integer.parseInt(st.nextToken());
                if (minHeight > arr[i][j]) {
                    minHeight = arr[i][j];
                }
                if (maxHeight < arr[i][j]) {
                    maxHeight = arr[i][j];
                }
            }
        }
    }
}
