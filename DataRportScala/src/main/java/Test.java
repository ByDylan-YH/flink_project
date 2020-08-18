import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;
import java.util.Date;

/**
 * Author:BYDylan
 * Date:2020/5/9
 * Description:
 */
public class Test {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String s = "2020-01-22 01:12:56";
        System.out.println(LocalDateTime.parse(s,formatter).toEpochSecond(ZoneOffset.of("+8")));
        System.out.println(LocalDateTime.parse(s,formatter).toInstant(ZoneOffset.of("+8")).toEpochMilli());
        String s1 = LocalDateTime.parse(s, formatter).format(formatter);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date parse = format.parse(s);
            System.out.println(parse.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
