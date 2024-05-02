// DFS와 BFS
package Silver_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Ex1260 {
    
    static StringBuilder sb = new StringBuilder();
    static boolean[] check; // 탐색했던 노드인지 검사하기 위한 배열
    static int[][] arr; // 노드 간의 간선을 표현해 주기 위한 표
    
    static int node, line, start; // 정점의 개수, 간선의 개수, 탐색을 시작할 정점의 번호
    
    static Queue<Integer> queue = new LinkedList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        arr = new int[node+1][node+1];
        check = new boolean[node+1];

        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()); // 간선이 연결하는 정점의 번호 1
            int b = Integer.parseInt(st.nextToken()); // 간선이 연결하는 정점의 번호 2

            arr[a][b] = arr[b][a] = 1; // 인접 행렬 방법
        }

        dfs(start);
        sb.append("\n");
        check = new boolean[node+1]; // check 배열 초기화

        bfs(start);

        System.out.println(sb);
    }

    static void dfs(int start) { // 깊이 우선 탐색 메서드 실행
        check[start] = true; // 탐색 했으므로 true
        sb.append(start + " ");

        for (int i = 0; i <= node; i++) {
            if (arr[start][i] == 1 && !check[i]) { // 노드가 존재하고 탐색하지 않았을 떄
                dfs(i);
            }
        }
    }

    static void bfs(int start) { // 너비 우선 탐색
        queue.add(start);
        check[start] = true; // 탐색 했으므로 true

        while (!queue.isEmpty()) {

            start = queue.poll();
            sb.append(start + " ");

            for (int i = 1; i <= node; i++) {
                if (arr[start][i] == 1 && !check[i]) { // 노드가 존재하고 탐색하지 않았을 떄
                    queue.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
