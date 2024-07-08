// 최애의 팀원
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex29813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<String> queue = new LinkedList<>();
        Queue<Integer> num = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String initial = st.nextToken();
            int x = Integer.parseInt(st.nextToken());

            queue.add(initial);
            num.add(x);
        }

        while (queue.size() > 1) {
            queue.poll();
            int numberOfPass = (num.poll()-1) % queue.size();
            while (numberOfPass != 0) {
                queue.add(queue.poll());
                num.add(num.poll());
                numberOfPass--;
            }
            queue.poll();
            num.poll();
        }

        System.out.println(queue.poll());
        num.poll();
    }
}
