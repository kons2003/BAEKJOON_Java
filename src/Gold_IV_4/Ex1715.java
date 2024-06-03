// 카드 정렬하기
package Gold_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Ex1715 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> cards = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine()); // 카드 묶음 카드 수

        for (int i = 0; i < n; i++) {
            cards.add(Integer.parseInt(br.readLine())); // 묶음당 장 수 저장 및 오름차순 정렬
        }

        int sum = 0; // 비교 횟수 저장
        while (cards.size() > 1) { // 카드 묶음이 하나면, 비교 X
            int a = cards.poll();
            int b = cards.poll();
            cards.add(a + b);

            sum += a + b;
        }

        System.out.println(sum);
    }
}
