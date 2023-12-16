// solved.ac
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Ex18110 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new ArrayDeque<>();
        int n = Integer.parseInt(br.readLine()); // 의견 수

        // 의견 수 만큼 난이도 입력 받는 코드
        int[] difficulty = new int[n]; // 난이도
        for (int i = 0; i < n; i++) 
            difficulty[i] = Integer.parseInt(br.readLine());
        Arrays.sort(difficulty); // 오름차순 정렬

        for (int i = 0; i < n; i++) // deque에 정렬된 값 추가
            deque.add(difficulty[i]);
        

        // 의견의 절사평균 코드
        int trimmedMean = (int) Math.round(n * 0.15); // 절사평균
        for (int i = 0; i < trimmedMean; i++) {
            deque.removeFirst();
            deque.removeLast();
        }

        // 난이도 평균 구하는 코드
        double sum = 0.0;
        int size = deque.size();
        for (int i = 0; i < size; i++)
            sum += deque.poll();

        int avg = (int) Math.round(sum / size);

        System.out.println(avg); // 평균 출력
    }
}
