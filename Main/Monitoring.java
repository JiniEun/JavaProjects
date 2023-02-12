package Main;


import static Utility.Util.getNumberFormat;
import static Utility.Util.isNull;
import static Utility.Util.isNumeric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Monitoring {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] input = br.readLine().split(" ");

            if (isNull(input[0]) || input[0].equals("0")) {
                System.out.println("Exit Program : 0|null");
                break;
            }
            try {
                String traffic = input[0];
                String error = input[1];

                if (isNumeric(traffic) && isNumeric(error)) {
                    traffic = getNumberFormat(traffic);
                    error = getNumberFormat(error);
                }
                sb.append(error + " (" + traffic + ")\n");
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
        System.out.println(sb);
    }
}
