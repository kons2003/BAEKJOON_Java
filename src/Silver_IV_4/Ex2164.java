// 카드2
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>(); // N장의 카드 저장할 큐
        int n = Integer.parseInt(br.readLine());

        // 순서대로 카드 초기화
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // 카드가 1개 남을 때까지 반복
        while (queue.size() > 1) {
            queue.remove(); // 맨 위 카드 버림
            queue.add(queue.poll()); // 맨 위 카드 맨 아래로 옮김
        }

        System.out.println(queue.peek());
    }
}
