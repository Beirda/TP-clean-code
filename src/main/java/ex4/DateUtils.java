package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static String defautPattern = "dd/MM/yyyy";

    public static String format(String pattern, Date date) {

        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }

    public static String formatDefaut(Date date) {

        return format(defautPattern, date);
    }
}
