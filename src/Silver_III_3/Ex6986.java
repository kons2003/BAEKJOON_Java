// 절사평균
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex6986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 점수 저장 후 정렬
        int n = Integer.parseInt(st.nextToken()); // 전체 점수의 개수

        List<Double> list = new ArrayList<>(); // 점수 저장 리스트
        for (int i = 0; i < n; i++) {
            list.add(Double.parseDouble(br.readLine()));
        }
        Collections.sort(list); // 점수 정렬

        // 절사, 보정평균 구하기
        int k = Integer.parseInt(st.nextToken()); // 제외되는 점수의 개수

        Deque<Double> deque = new ArrayDeque<>(list);
        for (int i = 0; i < k; i++) {
            deque.pollFirst();
            deque.pollLast();
        }

        double trimmedSum = deque.stream() // 절사평균 덧셈
                .mapToDouble(Double::doubleValue)
                .sum();
        double trimmedAverage = trimmedSum / (n - k * 2); // 절사평균

        double correctedSum = trimmedSum + deque.peekFirst() * k + deque.peekLast() * k; // 보정평균 덧셈
        double correctedAverage = correctedSum / n; // 보정평균

        String result = String.format("%.2f\n", trimmedAverage + 1e-8);
        result += String.format("%.2f\n", correctedAverage + 1e-8);

        System.out.print(result);
    }
}
