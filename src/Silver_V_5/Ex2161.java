// 카드1
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Ex2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> deck = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            deck.add(i);
        }

        StringBuilder sb = new StringBuilder();
        while (true) {
            sb.append(deck.poll()).append(" ");
            if (deck.isEmpty()) break;
            deck.add(deck.poll());
        }

        System.out.println(sb);
    }
}
