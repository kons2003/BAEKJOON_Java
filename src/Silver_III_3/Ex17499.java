// 수열과 시프트 쿼리
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//deque, 배열 시간 초과
public class Ex17499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i, x, s;
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());
        int[] sequence = new int[n];
        int[] tmp = new int[n];
        int shift;

        // 수열 입력
        st = new StringTokenizer(br.readLine());
        for (int j = 0; j < n; j++) {
            sequence[j] = (Integer.parseInt(st.nextToken()));
        }

        for (int j = 0; j < q; j++) {
            st = new StringTokenizer(br.readLine());

            switch (Integer.parseInt(st.nextToken())) {
                case 1: // ai에 정수 x만큼 더한다.
                    i = Integer.parseInt(st.nextToken());
                    x = Integer.parseInt(st.nextToken());
                    sequence[i-1] += x;
                    break;
                case 2: // 우측 시프트
                    s = Integer.parseInt(st.nextToken()) % sequence.length;
                    shift = s;
                    for (int k = 0; k < sequence.length; k++) {
                        tmp[k] = sequence[k];
                    }

                    for (int l = 0; l < sequence.length; l++) {
                        if (l - s < 0) {
                            sequence[l] = tmp[sequence.length - shift];
                            shift--;
                        } else { // l - shift >= 0
                            sequence[l] = tmp[l - s];
                        }
                    }
                    break;
                case 3: // 좌측 시프트
                    s = Integer.parseInt(st.nextToken()) % sequence.length;
                    shift = 0;
                    for (int k = 0; k < sequence.length; k++) {
                        tmp[k] = sequence[k];
                    }

                    for (int l = 0; l < sequence.length; l++) {
                        if (l + s >= sequence.length) {
                            sequence[l] = tmp[shift];
                            shift++;
                        } else { // l + shift < sequence.length
                            sequence[l] = tmp[l + s];
                        }
                    }
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n; j++) {
            sb.append(sequence[j]).append(" ");
        }

        System.out.println(sb);
    }
}
