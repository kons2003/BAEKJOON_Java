// 뒤집기
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int zeroCount = 0;
        int oneCount = 0;

        if (arr[0] == '0') { zeroCount++; }
        else { oneCount++; } // arr[0] == 1

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] == arr[i]) { continue; }
            if (arr[i] == '0') { zeroCount++; }
            else { oneCount++; } // arr[i] == 1
        }

        if (zeroCount != 0 && oneCount != 0) {
            System.out.println(Math.min(zeroCount, oneCount));
        } else {
            System.out.println(0);
        }
    }
}
