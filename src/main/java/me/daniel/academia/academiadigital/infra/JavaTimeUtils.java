package me.daniel.academia.academiadigital.infra;

import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class JavaTimeUtils {
    private JavaTimeUtils() {

    }

    private  static final Locale LOCALE_US = new Locale("en", "US");

    public static final DateTimeFormatter LOCAL_DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss", LOCALE_US);

    public static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd",LOCALE_US );


}
