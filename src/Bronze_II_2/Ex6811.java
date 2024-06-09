// Old Fishin’ Hole
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int trout = Integer.parseInt(br.readLine()); //  갈색 송어의 포인트
        int pike = Integer.parseInt(br.readLine()); // 강꼬치고기의 포인트
        int pickerel = Integer.parseInt(br.readLine()); // 월아이 피시의 포인트
        int totalPoint = Integer.parseInt(br.readLine()); // 강에 허용된 총 포인트

        // 종류별 잡을 수 있는 최대 수
        int maxTrout = totalPoint / trout;
        int maxPike = totalPoint / pike;
        int maxPickerel = totalPoint / pickerel;

        StringBuilder sb = new StringBuilder();
        int count = 0; // 총 경우의 수

        for (int i = 0; i <= maxTrout; i++) {
            for (int j = 0; j <= maxPike; j++) {
                for (int k = 0; k <= maxPickerel; k++) {
                    int sumPoint = (i * trout) + (j * pike) + (k * pickerel);
                    if (sumPoint <= totalPoint && sumPoint > 0) {
                        sb.append(i).append(" Brown Trout, ").append(j).append(" Northern Pike, ").append(k).append(" Yellow Pickerel\n");
                        count++;
                    }
                }
            }
        }

        System.out.print(sb);
        System.out.println("Number of ways to catch fish: " + count);
    }
}
