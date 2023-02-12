package Utility;

import java.text.DecimalFormat;

public class Util {

    public static boolean isNumeric(String input) {
        try {
            Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isNull(String input){
        return input == null || "".equals(input);
    }

    public static String getNumberFormat(String input) {
        DecimalFormat decFormat = new DecimalFormat("###,###");

        return decFormat.format(Long.parseLong(input));
    }
}
