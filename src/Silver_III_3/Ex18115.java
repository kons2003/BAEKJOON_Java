// 카드 놓기
package Silver_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Ex18115 {

    static Deque<Integer> deque = new LinkedList<>();
    static int n;
    static int num = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            stack.add(Integer.parseInt(st.nextToken()));
        }

        for (int i = 0; i < n; i++) {
            int skill = stack.pop();

            switch (skill) {
                case 1: drawTopCard(); break;
                case 2: drawSecondCard(); break;
                case 3: drawBottomCard(); break;
            }
        }

        print();
    }

    // 1, 제일 위의 카드 1장을 바닥에 내려놓는다.
    static void drawTopCard() {
        deque.addFirst(num++);
    }

    // 2, 위에서 두 번째 카드를 바닥에 내려놓는다.
    static void drawSecondCard() {
        int temp = deque.pollFirst();
        deque.addFirst(num++);
        deque.addFirst(temp);
    }

    // 3, 제일 밑에 있는 카드를 바닥에 내려놓는다.
    static void drawBottomCard() {
        deque.addLast(num++);
    }

    // 처음 카드의 상태를 출력
    static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(deque.poll() + " ");
        }
        System.out.println(sb);
    }
}

/*public class Ex18115 {

    static int n; // 카드 순서 번호 역순, n ~ 1
    static int[] statusOfInitialCard; // 카드 초기 상태 저장 배열

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        statusOfInitialCard = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < statusOfInitialCard.length; i++) {
            int skill = Integer.parseInt(st.nextToken());

            switch (skill) {
                case 1: drawTopCard(); break;
                case 2: drawSecondCard(); break;
                case 3: drawBottomCard(); break;
            }
        }

        print();
    }

    // 1, 제일 위의 카드 1장을 바닥에 내려놓는다.
    static void drawTopCard() {
        int i = 0;
        while (statusOfInitialCard[i] != 0) {
            i++;
        }
        statusOfInitialCard[i] = n;
        n--;
    }

    // 2, 위에서 두 번째 카드를 바닥에 내려놓는다.
    static void drawSecondCard() {
        boolean check = false;
        int i = 0;
        while (!check) {
            if (statusOfInitialCard[i] == 0) {
                check = true;
            }
            i++;
        }
        while (statusOfInitialCard[i] != 0) {
            i++;
        }
        statusOfInitialCard[i] = n;
        n--;
    }

    // 3, 제일 밑에 있는 카드를 바닥에 내려놓는다.
    static void drawBottomCard() {
        int i = statusOfInitialCard.length-1;
        while (statusOfInitialCard[i] != 0) {
            i--;
        }
        statusOfInitialCard[i] = n;
        n--;
    }

    // 처음 카드의 상태를 출력
    static void print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < statusOfInitialCard.length; i++) {
            sb.append(statusOfInitialCard[i] + " ");
        }
        System.out.println(sb);
    }
}*/
