// アイスクリーム (Ice Cream)
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex24087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine()); // 250엔
        int b = Integer.parseInt(br.readLine()); // 100엔
        int sum = 250;

        if (s > a && (s - a) % b == 0) {
            sum += ((s - a) / b) * 100;
        }else if(s > a && (s - a) % b != 0) {
            sum += (((s - a) / b) + 1) * 100;
        }

        System.out.println(sum);
    }
}
