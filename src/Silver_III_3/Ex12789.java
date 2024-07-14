// 도키도키 간식드리미
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        Stack<Integer> stack = new Stack<>();
        stack.push(0); // 순서대로 가능한지 검사 때, null 방지
        int currentNum = 1; // 현재 순서 번호

        while (true) {
            // 한 명씩만 설 수 있는 공간
            if (stack.peek() == currentNum) {
                stack.pop();
                currentNum++;
                continue;
            }

            // 현재 줄 서있는 곳
            if (!queue.isEmpty()) {
                if (queue.peek() == currentNum) {
                    queue.poll();
                    currentNum++;
                } else {
                    stack.push(queue.poll());
                }
            }

            if (queue.isEmpty() && stack.peek() != currentNum) {
                break;
            }
        }

        if (currentNum == n + 1) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
