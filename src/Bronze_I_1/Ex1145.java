// 적어도 대부분의 배수
package Bronze_I_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int count = 0;
        int N = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(true) {
            N++;
            for(int i = 0; i < 5; i++) {
                if(N >= arr[i] && N % arr[i] == 0) count++;
            }
            if(count > 2) break;
            count = 0;
        }
        System.out.println(N);
    }
}
