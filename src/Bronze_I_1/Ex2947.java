// 나무 조각
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] woodenPiece = new int[5]; // 나무 조각 순서 저장 배열

        // 배열 입력 받아서 저장
        for (int i = 0; i < 5; i++) {
            woodenPiece[i] = Integer.parseInt(st.nextToken());
        }

        // 순서대로 될때까지 반복
        while (true) {
            int check = 0; // 순서대로 됐는지 확인할 변수

            // 1 ~ 4 과정을 수행할 반복문
            for (int i = 0; i < 4; i++) {
                if (woodenPiece[i] > woodenPiece[i + 1]) {
                    int tmp = woodenPiece[i];
                    woodenPiece[i] = woodenPiece[i + 1];
                    woodenPiece[i + 1] = tmp;

                    // 순서가 바꼈을시 출력
                    for (int j =0; j < 5; j++) {
                        System.out.print(woodenPiece[j] +" ");
                    }
                    System.out.println();
                }

                // 해당 위치의 순서와 값이 같으면 check 증가
                if (woodenPiece[i] == i + 1) {
                    check++;
                }
            }
            // 순서가 모두 알맞으면 반복문 종료
            if (check == 4) {
                break;
            }
        }
    }
}
