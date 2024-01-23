// 집합
package Silver_V_5;

import java.io.*;
import java.util.StringTokenizer;

public class Ex11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int m = Integer.parseInt(br.readLine());
        String str;
        int x = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            str = st.nextToken();
            if (!(str.equals("all") || str.equals("empty"))) {
                x = Integer.parseInt(st.nextToken());
            }

            switch (str) {
                case "add": add(x); break;
                case "remove": remove(x); break;
                case "check": check(x); break;
                case "toggle": toggle(x); break;
                case "all": all(); break;
                case "empty": empty(); break;
            }
        }

        bw.flush();
        bw.close();
    }

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int s = 0;

    private static void add(int x) {
        s |= (1 << x);
    }

    private static void remove(int x) {
        s &= ~(1 << x);
    }

    private static void check(int x) throws IOException {
        if ((s & (1 << x)) == (1 << x)) {
            bw.write(String.valueOf(1));
            bw.newLine();
        } else {
            bw.write(String.valueOf(0));
            bw.newLine();
        }
    }

    private static void toggle(int x) {
        s ^= (1 << x);
    }

    private static void all() {
        s = (1 << 21) - 1;
    }

    private static void empty() {
        s = 0;
    }
}
