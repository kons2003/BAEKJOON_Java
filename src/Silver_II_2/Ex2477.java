// 참외밭
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine()); // 1m^2 당 자라는 참외의 개수

        int[][] arr = new int[6][2];

        // 입력
        for (int i = 0; i < 6; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 동쪽은 1, 서쪽은 2, 남쪽은 3, 북쪽은 4
            int direction = Integer.parseInt(st.nextToken()); // 방향
            int length = Integer.parseInt(st.nextToken()); // 길이

            arr[i][0] = direction;
            arr[i][1] = length;
        }

        // 가장 긴 가로, 세로 계산 및 각각 마지막 순서 저장
        int currentHorizontal = 0, maxHorizontal = 0; // 가로
        int currentVertical = 0, maxVertical = 0; // 세로

        for (int i = 0; i < 6; i++) {
            if (arr[i][0] == 1 || arr[i][0] == 2) {
                if (maxHorizontal < arr[i][1]) {
                    maxHorizontal = arr[i][1];
                    currentHorizontal = i;
                }
            } else if (arr[i][0] == 3 || arr[i][0] == 4) {
                if (maxVertical < arr[i][1]) {
                    maxVertical = arr[i][1];
                    currentVertical = i;
                }
            }
        }

        // 빈 사각형의 가로, 세로 구하기
        int emptyHorizontal = 0, emptyVertical = 0;

        if (currentHorizontal == 0) {
            emptyHorizontal = Math.abs(arr[5][1] - arr[1][1]);
        } else if (currentHorizontal == 5) {
            emptyHorizontal = Math.abs(arr[4][1] - arr[0][1]);
        } else {
            emptyHorizontal = Math.abs(arr[currentHorizontal + 1][1] - arr[currentHorizontal - 1][1]);
        }

        if (currentVertical == 0) {
            emptyVertical = Math.abs(arr[5][1] - arr[1][1]);
        } else if (currentVertical == 5) {
            emptyVertical = Math.abs(arr[4][1] - arr[0][1]);
        } else {
            emptyVertical = Math.abs(arr[currentVertical + 1][1] - arr[currentVertical - 1][1]);
        }

        // 결과 계산
        int result = (maxHorizontal * maxVertical - emptyHorizontal * emptyVertical) * k;

        System.out.println(result);
    }
}
