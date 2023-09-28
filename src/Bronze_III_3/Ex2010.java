// 플러그
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2010 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int plug = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++){
            plug += Integer.parseInt(br.readLine());
        }

        System.out.println(plug - (n - 1));
    }
}
