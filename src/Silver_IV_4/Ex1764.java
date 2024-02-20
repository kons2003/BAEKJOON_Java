// 듣보잡
package Silver_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Ex1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            hashSet.add(br.readLine());
        }

        TreeSet<String> treeSet = new TreeSet<>();
        String names = " ";
        int cnt = 0;

        for (int i = 0; i < m; i++) {

            names = br.readLine();
            if (hashSet.contains(names)) {
                treeSet.add(names);
                cnt++;
            }
        }

        System.out.println(cnt);

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
