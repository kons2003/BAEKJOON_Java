// 루트
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex4619 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());

            int b = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int num1 = 0;
            int num2 = 0;

            if(b == 0 && n == 0) {
                break;
            }

            int i = 0;

            while(true) {

                if(Math.pow(i, n) <= b) {
                    num1 = i;
                }else if(Math.pow(i, n) > b){
                    num2 = i;
                    break;
                }
                i++;
            }

            int result = (Math.abs(Math.pow(num1, n) - b) <= Math.abs(Math.pow(num2, n) - b)) ? num1 : num2;

            System.out.println(result);
        }
    }
}
