// 제곱 ㄴㄴ 수
package Gold_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Ex1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken()); // min
        long max = Long.parseLong(st.nextToken()); // max
        long intCount = max - min + 1; // 범위 내 정수 개수 저장할 변수
        long subCount = 0; // 제곱 ㄴㄴ 수가 아닌 정수 개수 저장할 변수
        HashMap<Long, Long> map = new HashMap<>();



        // 제곱 ㄴㄴ 수 = (min~max 정수 개수) - (min~max 제곱 ㄴㄴ 수기 아닌 정수 개수)
        System.out.println(intCount - subCount);
    }

}
    // 시간 초과 O(N^2)
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long min = Long.parseLong(st.nextToken()); // min
        long max = Long.parseLong(st.nextToken()); // max

        long intCount = 0; // 범위 내 정수 개수 저장할 변수
        // min ~ max 범위에 정수 개수 카운트
        for (long i = min; i <= max; i++)
            intCount++;

        long subCount = 0; // 제곱 ㄴㄴ 수가 아닌 정수 개수 저장할 변수
        for (long i = min; i <= max; i++) {

            if (i == 1) // 1은 제곱 ㄴㄴ 수이다.
                continue;

            if (Math.floor(Math.sqrt(i)) == Math.ceil(Math.sqrt(i))) { // i의 제곱근의 올림, 내림이 같다면, 정수다.
                subCount++;
            } else {

                boolean flag = false;

                for (long j = 2; j < Math.sqrt(i); j++)
                    if ((i % (j * j)) == 0)
                        flag = true;
                if (flag)
                    subCount++;
            }
        }

        System.out.println(intCount - subCount); // 제곱 ㄴㄴ 수 = (min~max 정수 개수) - (min~max 제곱 ㄴㄴ 수기 아닌 정수 개수)
    }*/
