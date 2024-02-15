// 전자레인지
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10162 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";

        int[] arr = {300, 60, 10};
        int t = Integer.parseInt(str);

        if (t % 10 != 0) {
            System.out.println("-1");
        } else {
            for (int i = 0; i < arr.length; i++) {
                result += t / arr[i]+" ";
                t %= arr[i];
            }
            System.out.println(result);
        }
    }
}
