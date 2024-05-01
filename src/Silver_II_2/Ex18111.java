// 마인크래프트
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 세로 너비
        int m = Integer.parseInt(st.nextToken()); // 가로 너비
        int b = Integer.parseInt(st.nextToken()); // 인벤토리 블록 수

        // 땅의 높이 입력 받음
        int[][] ground = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                ground[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 땅의 높이별 걸리는 시간 계산
        int[] timeByHeight = new int[257];
        int minTime = Integer.MAX_VALUE;
        String stringMinTime = "";
        for (int i = 0; i < timeByHeight.length; i++) {
            int totalB = b; // 초기 인벤토리 블록 개수

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (i < ground[j][k]) { // 블록 제거, 인벤토리에 넣는다.
                        timeByHeight[i] += (ground[j][k] - i) * 2; // 1번 작업 방식
                        totalB += (ground[j][k] - i); // 제거한 블럭 인벤토리에 추가
                    } else if (i > ground[j][k]) { // 블록 놓기, 인벤토리에서 꺼낸다.
                        timeByHeight[i] += (i - ground[j][k]); // 2번 작업 방식
                        totalB -= (i - ground[j][k]);
                    }
                }
            }

            if (totalB < 0) { // 인벤토리 블럭 수가 음수면 그 높이는 불가능
                timeByHeight[i] = Integer.MAX_VALUE;
            }

            if (timeByHeight[i] <= minTime) { // 최소 시간 중 최대 높이 구함
                stringMinTime = timeByHeight[i] + " " + i;
                minTime = timeByHeight[i];
            }
        }

        System.out.println(stringMinTime);
    }
}