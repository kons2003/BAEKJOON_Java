// 요세푸스 문제
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) { // queue 초기화
            queue.add(i);
        }

        // 요세푸스 순열 구하는 코드
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 1; i < k; i++) { // k번째 전까지 맨 앞 숫자는 뒤로 보냄
                queue.add(queue.poll());
            }
            sb.append(queue.poll());
            sb.append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // 마지막 ", " 제거
        sb.append(">");

        System.out.println(sb);
    }
}
