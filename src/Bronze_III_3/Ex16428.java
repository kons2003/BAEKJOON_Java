// A/B - 3
package Bronze_III_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Ex16428 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        if(a.compareTo(BigInteger.ZERO) == -1 && b.compareTo(BigInteger.ZERO) == -1) {
            System.out.println((a.divide(b)).add(BigInteger.ONE));
            System.out.println((a.remainder(b)).subtract(b));
        }else if(a.compareTo(BigInteger.ZERO) == -1 && b.compareTo(BigInteger.ZERO) == 1){
            System.out.println((a.divide(b)).subtract(BigInteger.ONE));
            System.out.println((a.remainder(b)).add(b));
        }else {
            System.out.println(a.divide(b));
            System.out.println(a.remainder(b));
        }
    }
}
