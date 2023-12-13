// 수 찾기
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Ex1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Integer> treeSet = new TreeSet<>();
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (treeSet.contains(Integer.parseInt(st.nextToken())))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }

        System.out.print(sb);
    }

    // 시간초과
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> arr = new ArrayList<>();
        int num = 0;

        int n = Integer.parseInt(br.readLine()); // N

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(st.nextToken());
            arr.add(num);
        }

        int m = Integer.parseInt(br.readLine()); // M

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {

            num = Integer.parseInt(st.nextToken());
            if (arr.contains(num)) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
    }*/
}
