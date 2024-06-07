// 고양이 카페
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Ex28353 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 첫 번째 줄 입력
        int n = Integer.parseInt(st.nextToken()); // 고양이의 수
        long k = Long.parseLong(st.nextToken()); // 한 명이 견딜 수 있는 최대 무게

        // 두 번째 줄 입력
        ArrayList<Long> weight = new ArrayList<>(); // 고양이의 무게를 저장할 연결리스트 선언
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            weight.add(Long.parseLong(st.nextToken()));
        }

        // 무게 오름차순 정렬
        Collections.sort(weight);

        // 행복해질 수 있는 사람의 수 최댓값 계산
        int temp = weight.size() - 1;
        int count = 0; // 행복해질 수 있는 사람 카운트 변수

        while (!weight.isEmpty() && 0 < temp && weight.get(0) <= k) {
            if (weight.get(0) + weight.get(temp) <= k) {
                weight.remove(temp);
                weight.remove(0);
                temp = weight.size() - 1;
                count++;
            } else {
                temp--;
            }
        }

        System.out.println(count);
    }
}
