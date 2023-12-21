// A와 B
package Gold_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex12904 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean flag = false;
        String s = br.readLine();
        String t = br.readLine();

        StringBuilder sb = new StringBuilder(t);

        while (s.length() < sb.length()) { // s와 sb(t)가 같지 않으면 반복
            if (sb.lastIndexOf("A") == sb.length() - 1) { // 맨 뒤가 A 일때
                sb.deleteCharAt(sb.length() -1);
            } else { // 뒤집고, 맨 뒤가 B 일때
                sb.deleteCharAt(sb.length() -1);
                sb.reverse();
            }
        }

        if (s.contentEquals(sb)) {
            flag = true;
        }

        if (flag) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}