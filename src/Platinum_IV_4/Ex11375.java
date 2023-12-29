// 열혈강호
package Platinum_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Ex11375 {

    static List<Integer>[] list;
    static boolean[] check;
    static int[] d;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 직원의 수
        int m = Integer.parseInt(st.nextToken()); // 일의 개수

        list = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }

        check = new boolean[m + 1];
        d = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            for (int j = 0; j < s; j++) {
                list[i].add(Integer.parseInt(st.nextToken()));
            }
        }

        int cnt = 0;
        // 1 ~ n번 직원 순차대로 일 할당
        for (int i = 1; i <= n; i++) {
            Arrays.fill(check, false);
            if (dfs(i)) cnt++; // 일이 할당 되었으면, cnt++
        }
        System.out.println(cnt);
    }

    static boolean dfs(int here) {
        for (int nxt : list[here]) {
            if (!check[nxt]) {
                check[nxt] = true;
                // 비어 있거나 점유 노드에 더 들어갈 공간이 있는 경우
                if (d[nxt] == 0 || dfs(d[nxt])) {
                    d[nxt] = here;
                    return true;
                }
            }
        }
        return false;
    }
}
