// 요세푸스 문제 0
package Silver_V_5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken()); // N명의 사람
        int k = Integer.parseInt(st.nextToken()); // K번째 사람 제거

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) { // queue에 인원수 만큼 순서대로 초기화
            queue.add(i);
        }

        // 요세푸스 순열 출력 코드
        sb.append("<");
        while (!(queue.isEmpty())) { // queue가 빌 때까지 반복

            // K 이전 요소는 맨 뒤로 보냄
            for (int i = 0; i < k - 1; i++) { // 1 ~ K-1까지 반복
                queue.add(queue.poll()); // 맨 앞 요소 반환후 삭제하고, 그 반환값을 add해서 맨 뒤로 보냄
            }
            sb.append(queue.poll()).append(", "); // 문자열에 K번째 요소, 콤마 추가
        }
        sb.replace(sb.length() - 2, sb.length(), ">"); // 마지막 콤마와 공백, >로 교체

        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
    }
}