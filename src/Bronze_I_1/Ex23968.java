// 알고리즘 수업 - 버블 정렬 1
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex23968 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 배열 a의 크기
        int k = Integer.parseInt(st.nextToken()); // 교환 횟수

        int[] a = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        bubbleSort(a, n, k);
    }

    static void bubbleSort(int[] a, int n, int k) { // a배열 오른차순 정렬
        int count = 0;
        String answer = "-1";

        for (int last = n-1; last > 0; last--) {
            for (int i = 0; i < last; i++) {
                if (a[i] > a[i + 1]) { // a[i] <-> a[i + 1]
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    count++;
                    if (count == k) {
                        answer = a[i] + " " + a[i + 1];
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
