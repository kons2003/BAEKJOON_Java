// 수열과 시프트 쿼리
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

//TODO deque 배열로 바꾸기
public class Ex17499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i, x, s;
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        Deque<Integer> sequence = new ArrayDeque<>();

        // 수열 입력
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            sequence.add(Integer.parseInt(st.nextToken()));
        }

        for (int j = 0; j < q; j++) {
            st = new StringTokenizer(br.readLine());

            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                    i = Integer.parseInt(st.nextToken());
                    x = Integer.parseInt(st.nextToken());
                    for (int k = 1; k <= sequence.size(); k++) {
                        if (i == k) {
                            sequence.addFirst(sequence.poll() + x);
                        }
                        sequence.add(sequence.poll());
                    }
                    break;
                case 2: // 우측 시프트
                    s = Integer.parseInt(st.nextToken());
                    for (int k = 0; k < s; k++) {
                        sequence.addFirst(sequence.pollLast());
                    }
                    break;
                case 3: // 좌측 시프트
                    s = Integer.parseInt(st.nextToken());
                    for (int k = 0; k < s; k++) {
                        sequence.addLast(sequence.pollFirst());
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append(sequence.poll()).append(" ");
        }

        System.out.println(sb);
    }
}
