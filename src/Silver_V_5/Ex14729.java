// 칠무해
package Silver_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex14729 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Double> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            double data = Double.parseDouble(br.readLine());

            if (list.size() == 7) {
                for (int j = 0; j < list.size(); j++) {

                    if (list.get(j) >= data) {
                        list.remove(list.size() - 1);
                        list.add(data);
                        break;
                    }
                }
            } else {
                list.add(data);
            }
            Collections.sort(list); //리스트 정렬
        }

        for (double item : list) {
            System.out.printf("%.3f\n", item);
        }
    }
}
