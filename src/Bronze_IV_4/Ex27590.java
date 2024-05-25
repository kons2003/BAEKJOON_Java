// Sun and Moon
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ex27590 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int ds = Integer.parseInt(st.nextToken());
        int ys = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int dm = Integer.parseInt(st.nextToken());
        int ym = Integer.parseInt(st.nextToken());

        int s = ys - ds;
        int m = ym - dm;

        while(s != m) {
            if(s < m) {
                s += ys;
            }else {
                m += ym;
            }
        }
        System.out.println(s);
    }
}
