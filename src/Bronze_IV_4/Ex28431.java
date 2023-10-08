// 양말 짝 맞추기
package Bronze_IV_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class Ex28431 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 5;

        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<count; i++) {
            int num = Integer.parseInt(br.readLine());
            if(set.contains(num)) set.remove(num);
            else set.add(num);
        }

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
