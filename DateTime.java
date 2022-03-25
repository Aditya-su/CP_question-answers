import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        LocalDateTime gg = LocalDateTime.now();
        System.out.println("Before Formating: " + gg);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, DD MM yyyy HH:MM:SS");
        String formated = gg.format(fmt);
        System.out.println("After Formatting: "+formated);

    }
}
