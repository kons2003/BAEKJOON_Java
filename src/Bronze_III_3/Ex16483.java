// 접시 안의 원
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex16483 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(br.readLine());

        System.out.println(Math.round((t/2) * (t/2)));
    }
}
