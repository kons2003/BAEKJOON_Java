// 등수 구하기
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); // 랭킹 리스트에 있는 점수의 수
        long newScore = Long.parseLong(st.nextToken()); // 새로운 점수
        int p = Integer.parseInt(st.nextToken()); // 랭킹 리스트에 들어갈 수 있는 점수의 개수

        // 현재 랭킹 리스트에 있는 점수
        Long[] rankList = new Long[p + 1]; // 순위권 외의 점수일 떄 고려함

        if (n > 0) { // 기존 점수가 없으면 입력 X
            st = new StringTokenizer(br.readLine());
        }
        for (int i = 0; i <= p; i++) {
            if (i < n) { // 기존 점수가 있을 시
                rankList[i] = Long.parseLong(st.nextToken());
            } else if (i == n) { 
                rankList[i] = newScore;
            } else { // 빈 배열 공간 초기화
                rankList[i] = (long) -1;
            }
        }
        Arrays.sort(rankList, Collections.reverseOrder()); // 비오름차순 정렬

        // 새로운 점수(newScore) rank 계산
        int ans = 0; // 결과 저장 변수

        if (n + 1 > p && rankList[p] == newScore) { // 순위권 밖인 경우
            ans = -1;
        } else { // 순위권 내인 경우
            int rank = 1;

            int i = 0;
            while (rankList[i] > newScore) {
                rank++;
                i++;
            }
            ans = rank; // newScore의 등수 저장
        }

        // 결과 출력
        System.out.println(ans);
    }
}
