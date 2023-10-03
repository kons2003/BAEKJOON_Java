// 진흥원 세미나
package Bronze_V_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30087 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String semina = br.readLine();

            switch (semina) {
                case "Algorithm":
                    System.out.println("204"); break;
                case "DataAnalysis":
                    System.out.println("207"); break;
                case "ArtificialIntelligence":
                    System.out.println("302"); break;
                case "CyberSecurity":
                    System.out.println("B101"); break;
                case "Network":
                    System.out.println("303"); break;
                case "Startup":
                    System.out.println("501"); break;
                case "TestStrategy":
                    System.out.println("105"); break;
            }
        }
    }
}
