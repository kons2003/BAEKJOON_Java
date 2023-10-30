// 성 지키기
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1236 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 성의 세로 크기
        int m = Integer.parseInt(st.nextToken()); // 성의 가로 크기
        int security = n; // 층 수 만큼 경비원 수 초기화

        for (int i = 0; i < n; i++) { // 세로 만큼 반복
            String castle = br.readLine(); // 성 상태 입력
            char[] status = castle.toCharArray(); // 성 상태 char[]로 변환

            // 추가할 경비원 수 계산 코드
            for (int j = 0; j < m; j++) { // 가로 만큼 반복
                if (status[j] == 'X') { // X(경비원)이 있을 시, 추가할 경비원 수 감소
                    security--;
                    break; // 층에 경비원이 배치 돼 있으면 최소 경비원 수 만족하므로 멈춤
                }
            }
        }

        System.out.println(security); // 추가할 경비원의 최솟값 출력
    }
}
