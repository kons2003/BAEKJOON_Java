// 최댓값
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        int num = 0; // 입력받은 숫자 저장 공간
        int maxNum = 0; // 최댓값 저장 공간
        int maxLow = 1; // 최댓값의 행
        int maxCol = 1; // 최댓값의 열

        for (int row = 1; row <= 9; row++) { // 행
            st = new StringTokenizer(br.readLine());

            for (int col = 1; col <= 9; col++) { // 열
                num = Integer.parseInt(st.nextToken());

                if (num > maxNum) {
                    maxNum = num;
                    maxLow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println(maxNum);
        System.out.println(maxLow +" "+ maxCol);
    }
}
