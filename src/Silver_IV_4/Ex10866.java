// 덱
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Optional;
import java.util.StringTokenizer;

public class Ex10866 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push_front": pushFront(); break;
                case "push_back": pushBack(); break;
                case "pop_front": sb.append(popFront()).append("\n"); break;
                case "pop_back": sb.append(popBack()).append("\n"); break;
                case "size": sb.append(size()).append("\n"); break;
                case "empty": sb.append(empty()).append("\n"); break;
                case "front": sb.append(front()).append("\n"); break;
                case "back": sb.append(back()).append("\n"); break;
            }
        }

        System.out.print(sb);
    }


    static void pushFront() {
        deque.addFirst(Integer.parseInt(st.nextToken()));
    }

    static void pushBack() {
        deque.addLast(Integer.parseInt(st.nextToken()));
    }

    static int popFront() {
        return Optional.ofNullable(deque.pollFirst())
                .orElse(-1);
    }

    static int popBack() {
        return Optional.ofNullable(deque.pollLast())
                .orElse(-1);
    }

    static int size() {
        return deque.size();
    }

    static int empty() {
        return deque.isEmpty() ? 1 : 0;
    }

    static int front() {
        return Optional.ofNullable(deque.peekFirst())
                .orElse(-1);
    }

    static int back() {
        return Optional.ofNullable(deque.peekLast())
                .orElse(-1);
    }
}
