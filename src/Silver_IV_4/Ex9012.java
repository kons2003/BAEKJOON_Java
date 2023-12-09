// 괄호
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<String> stack = new Stack<>();
        int t = Integer.parseInt(br.readLine()); // T

        for (int i = 0; i < t; i++) {

            char[] bracket = br.readLine().toCharArray(); // 괄호 배열로 초기화
            int flag = 1; // NO와 YES 구분 flag

            for (int j=0; j<bracket.length; j++) { // bracket 배열 길이만큼 반복

                if (bracket[j] == '(') {
                    stack.add("(");
                } else if (bracket[j] == ')') {
                    if (stack.isEmpty()) { // 스택이 비어 있을 때,
                        flag = 0;
                        break;
                    }
                    stack.pop();
                }
            }

            if (!stack.isEmpty()) { // 스택이 비어 있지 않을 때,
                flag = 0;
                stack.clear(); // 스택 비움
            }

            if (flag == 0) {
                sb.append("NO").append("\n");
                continue;
            }
            sb.append("YES").append("\n");
        }

        System.out.println(sb);
    }
}
