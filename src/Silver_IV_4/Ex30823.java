// 건공문자열
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Ex30823 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String s = br.readLine();

        StringBuilder resultS = new StringBuilder(); // 결과 문자열
        Deque<Character> remainingS = s.chars() // 뒤집은 문자열 제외 남은 문자열
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(ArrayDeque::new));
        Deque<Character> currentS = new ArrayDeque<>(); // 현재 뒤집어야 하는 문자열

        // 처음 뒤집어야 하는 문자열 저장
        for (int i = 0; i < k; i++) {
            currentS.add(remainingS.poll());
        }

        // 마지막 전까지의 건공문자열 계산
        int numberOfFlips = n - k + 1; // 뒤집어야 하는 횟수
        boolean oddFlip = false; // 홀수 번쨰 뒤집힌 경우

        while (numberOfFlips > 1) {
            oddFlip = !oddFlip; // 뒤집힘
            if (oddFlip) { // 홀수 번째
                resultS.append(currentS.pollLast()); // 맨 뒤 추출
                currentS.addFirst(remainingS.poll());
            } else { // 짝수 번째
                resultS.append(currentS.pollFirst()); // 맨 앞 추출
                currentS.addLast(remainingS.poll());
            }
            numberOfFlips--; // 뒤집어야 하는 횟수 감소
            if (!remainingS.isEmpty()) { // 남은 문자열이 있는 동안
            }
        }

        // 마지막 건공문자열이 처음에서 뒤집혔는지 체크
        oddFlip = !oddFlip;
        if (oddFlip) { // 홀수 번째일 때
            resultS.append(currentS.pollLast()); // 맨 뒤 추출
            while (!currentS.isEmpty()) {
                resultS.append(currentS.pollLast()); // 뒤집음
            }
        } else { // 짝수 번째일 때
            resultS.append(currentS.pollFirst()); // 맨 앞 추출
            while (!currentS.isEmpty()) {
                resultS.append(currentS.pollFirst()); // 안 뒤집음
            }
        }

        // 결과 출력
        System.out.println(resultS);
    }
}
