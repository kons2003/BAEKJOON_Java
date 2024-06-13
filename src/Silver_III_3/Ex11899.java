// 괄호 끼워넣기
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex11899 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] s = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();

        int count = 0; // 붙여야할 괄호의 개수

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '(') {
                stack.push('(');
            } else { // ')'
                if (stack.isEmpty()) { // '('가 없으면
                    count++;
                } else {
                    stack.pop();
                }
            }
        }
        if (!stack.isEmpty()) { // 남은 '('만큼 count 더함
            count += stack.size();
        }

        System.out.println(count);
    }
}
