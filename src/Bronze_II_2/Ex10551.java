// STROJOPIS
package Bronze_II_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex10551 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();

        int leftPinky = 0;
        int leftRingFinger = 0;
        int leftMiddleFinger = 0;
        int leftIndexFinger = 0;

        int rightIndexFinger = 0;
        int rightMiddleFinger = 0;
        int rightRingFinger = 0;
        int rightPinky = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '`' || arr[i] == '~'
                    || arr[i] == '1' || arr[i] == '!'
                    || arr[i] == 'q' || arr[i] == 'Q'
                    || arr[i] == 'a' || arr[i] == 'A'
                    || arr[i] == 'z' || arr[i] == 'Z') {
                leftPinky++;
            } else if (arr[i] == '2' || arr[i] == '@'
                    || arr[i] == 'w' || arr[i] == 'W'
                    || arr[i] == 's' || arr[i] == 'S'
                    || arr[i] == 'x' || arr[i] == 'X') {
                leftRingFinger++;
            } else if (arr[i] == '3' || arr[i] == '#'
                    || arr[i] == 'e' || arr[i] == 'E'
                    || arr[i] == 'd' || arr[i] == 'D'
                    || arr[i] == 'c' || arr[i] == 'C') {
                leftMiddleFinger++;
            } else if (arr[i] == '4' || arr[i] == '$'
                    || arr[i] == 'r' || arr[i] == 'R'
                    || arr[i] == 'f' || arr[i] == 'F'
                    || arr[i] == 'v' || arr[i] == 'V'
                    || arr[i] == '5' || arr[i] == '%'
                    || arr[i] == 't' || arr[i] == 'T'
                    || arr[i] == 'g' || arr[i] == 'G'
                    || arr[i] == 'b' || arr[i] == 'B') {
                leftIndexFinger++;
            } else if (arr[i] == '6' || arr[i] == '^'
                    || arr[i] == 'y' || arr[i] == 'Y'
                    || arr[i] == 'h' || arr[i] == 'H'
                    || arr[i] == 'n' || arr[i] == 'N'
                    || arr[i] == '7' || arr[i] == '&'
                    || arr[i] == 'u' || arr[i] == 'U'
                    || arr[i] == 'j' || arr[i] == 'J'
                    || arr[i] == 'm' || arr[i] == 'M') {
                rightIndexFinger++;
            } else if (arr[i] == '8' || arr[i] == '*'
                    || arr[i] == 'i' || arr[i] == 'I'
                    || arr[i] == 'k' || arr[i] == 'K'
                    || arr[i] == ',' || arr[i] == '<') {
                rightMiddleFinger++;
            } else if (arr[i] == '9' || arr[i] == '('
                    || arr[i] == 'o' || arr[i] == 'O'
                    || arr[i] == 'l' || arr[i] == 'L'
                    || arr[i] == '.' || arr[i] == '>') {
                rightRingFinger++;
            } else if (arr[i] == '0' || arr[i] == ')'
                    || arr[i] == 'p' || arr[i] == 'P'
                    || arr[i] == ';' || arr[i] == ':'
                    || arr[i] == '/' || arr[i] == '?'
                    || arr[i] == '-' || arr[i] == '_'
                    || arr[i] == '[' || arr[i] == '{'
                    || arr[i] == '\'' || arr[i] == '\"'
                    || arr[i] == '=' || arr[i] == ']'
                    || arr[i] == '+' || arr[i] == '}') {
                rightPinky++;
            }
        }
        System.out.println(leftPinky);
        System.out.println(leftRingFinger);
        System.out.println(leftMiddleFinger);
        System.out.println(leftIndexFinger);
        System.out.println(rightIndexFinger);
        System.out.println(rightMiddleFinger);
        System.out.println(rightRingFinger);
        System.out.println(rightPinky);
    }
}
