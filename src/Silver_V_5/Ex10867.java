// 중복 빼고 정렬하기
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Ex10867 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        TreeSet<Integer> treeSet = new TreeSet<>(); // 중복 없이 저장 위한 트리셋
        for (int i = 0; i < n; i++) {
            treeSet.add(Integer.parseInt(st.nextToken()));
        }

        // 모든 정수 출력
        Iterator<Integer> iter = treeSet.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
