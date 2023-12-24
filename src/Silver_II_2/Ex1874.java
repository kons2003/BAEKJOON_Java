// 스택 수열
package Silver_II_2;

import java.io.*;
import java.util.Stack;

public class Ex1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m; // 수열을 이루는 정수
        int max = 0; // 스택의 최대 숫자
        boolean flag = true; // NO를 출력할 지, 판별해 줄 flag

        for (int i = 0; i < n; i++) {
            m = Integer.parseInt(br.readLine());

            if (max < m) {
                for (int j = max + 1; j <= m; j++) {
                    push(j);
                }
                pop();
                max = m;

            } else if (max > m) {
                if (!stack.isEmpty() && stack.peek() >= m) {
                    while (stack.peek() > m) {
                        pop();
                    }
                    pop();

                } else {
                    flag = false; // NO
                }
            }
        }

        if (flag) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }

    static Stack<Integer> stack = new Stack<>();
    static StringBuilder sb = new StringBuilder();

    static void push(int num) {
        stack.push(num);
        sb.append("+").append("\n");
    }

    static void pop() {
        stack.pop();
        sb.append("-").append("\n");
    }
}
