// 큐
package Silver_IV_4;

import java.io.*;
import java.util.*;

public class Ex10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            switch (command) {
                case "push": push(Integer.parseInt(st.nextToken())); break;
                case "pop": sb.append(pop()).append("\n"); break;
                case "size": sb.append(size()).append("\n"); break;
                case "empty": sb.append(empty()).append("\n"); break;
                case "front": sb.append(front()).append("\n"); break;
                case "back": sb.append(back()).append("\n"); break;
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }

    static Deque<Integer> queue = new ArrayDeque<>();

    static void push(int num) {
        queue.add(num);
    }

    static int pop() {
        return Optional.ofNullable(queue.poll())
                .orElse(-1);
    }

    static int size() {
        return queue.size();
    }

    static int empty() {
        if (queue.isEmpty()) {
            return 1;
        }
        return 0;
    }

    static int front() {
        return Optional.ofNullable(queue.peek())
                .orElse(-1);
    }

    static int back() {
        return Optional.ofNullable(queue.peekLast())
                .orElse(-1);
    }
}
