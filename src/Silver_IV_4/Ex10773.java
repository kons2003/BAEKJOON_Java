// 제로
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Ex10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < k; i++) {

            int n = Integer.parseInt(br.readLine());

            if (n != 0) {
                stack.push(n);
                continue;
            }
            if (!stack.isEmpty())
                stack.pop();
        }

        int sum = 0;
        while (!stack.isEmpty())
            sum += stack.pop();

        System.out.println(sum);
    }
}
