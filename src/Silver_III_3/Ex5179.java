// 우승자는 누구?
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex5179 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append("Data Set ").append(i + 1).append(":\n");

            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken()); // 대회에 사용된 문제의 개수
            int N = Integer.parseInt(st.nextToken()); // 총 제출 수
            int P = Integer.parseInt(st.nextToken()); // 참가자의 수

            int[][] players = new int[P][2]; // 참가자별 푼 [0]문제 수, [1]총점 배열
            boolean[][] success = new boolean[P][M]; // 참가자별 문제 맞힌 여부
            int[][] fail = new int[P][M]; // 참가자별 문제 틀린 횟수

            for (int l = 0; l < N; l++) {
                st = new StringTokenizer(br.readLine());

                int p = Integer.parseInt(st.nextToken()) - 1; // 제출한 참가자
                int m = st.nextToken().charAt(0) - 'A'; // 문제 번호, 숫자로 변환
                int t = Integer.parseInt(st.nextToken()); // 제출한 시각
                int j = Integer.parseInt(st.nextToken()); // 정답 여부

                if (!success[p][m]) { // 해당 참가자가 해당 문제를 푼 적이 없을 경우
                    if (j == 1) { // 맞았을 때
                        success[p][m] = true; // 맞은 문제 true
                        players[p][0]++; // 푼 문제 수 증가
                        players[p][1] += t + fail[p][m] * 20; // 총점 계산
                    } else { // 틀렸을 떄
                        fail[p][m]++; // 실패 횟수 증가
                    }
                }
            }

            // 참가자 번호 구분 위한 코드
            Map<int[], Integer> playerNum = new HashMap<>();
            for (int l = 0; l < P; l++) {
                int num = l + 1;
                playerNum.put(players[l], num);
            }

            // 정렬 코드
            Arrays.sort(players, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) { // 푼 문제 수 같을 때
                        return o1[1] - o2[1];
                    } else {
                        return o2[0] - o1[0];
                    }
                }
            });

            // 출력할 결과 저장
            for (int l = 0; l < P; l++) {
                sb.append(playerNum.get(players[l])).append(" ") // 참가자 아이디
                        .append(players[l][0]).append(" ") // 푼 문제 수
                        .append(players[l][1]).append(" ") // 총점
                        .append("\n");
            }

            // 테스트 케이스가 남았을 떄
            if (i < k - 1) {
                sb.append("\n");
            }
        }

        // 결과 출력
        System.out.print(sb);
    }
}
