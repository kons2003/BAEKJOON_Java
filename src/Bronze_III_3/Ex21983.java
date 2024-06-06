// Basalt Breakdown
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long a = Long.parseLong(br.readLine());

        double s = Math.sqrt(2 / (3 * Math.sqrt(3)) * a);

        System.out.println(s * 6);
    }
}
