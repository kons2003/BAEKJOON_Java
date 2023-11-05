// 햄버거 만들기
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex25628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while(true) {
            if(A <= 1 || B == 0) {
                break;
            }

            A -= 2;
            B -= 1;

            cnt++;
        }

        System.out.println(cnt);


    }
}
