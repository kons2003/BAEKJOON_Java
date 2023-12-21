// 균형잡힌 세상
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        // "."이 저장될 때까지 str에 문자열 저장 반복
        while (!".".equals(str = br.readLine())) {

            char[] c =str.toCharArray(); // char배열로 변환
            Stack<Character> stack = new Stack<>();
            boolean flag = true; // '(' or '['가 없이 문자열만 있을때 구분 위한 flag

            for (int i = 0; i < c.length; i++) {

                // '(' or '['일 시,
                if (c[i] == '(' || c[i] == '[') {
                    stack.push(c[i]);
                }

                // ')' or ']'일 시,
                if (c[i] == ')' || c[i] == ']') {
                    // ')' or ']' 구분 코드
                    if (stack.isEmpty()) { // '(' or '[' push 없이 닫히기만 하면, 균형 잡힌 문자열X
                        flag = false;
                    } else if (stack.peek() == '(' && c[i] == ')') {
                        stack.pop();
                    } else if (stack.peek() == '[' && c[i] == ']') {
                        stack.pop();
                    } else {
                        break;
                    }
                }
            }

            if (str.length() == 0) {
                flag = false;
            }

            if (flag && stack.isEmpty()) {
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.print(sb);
    }
}
