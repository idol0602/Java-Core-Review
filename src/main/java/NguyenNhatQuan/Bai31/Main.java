package NguyenNhatQuan.Bai31;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
//        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = LocalDate.of(2025,4,16);
//        LocalDate date3 = LocalDate.parse("2004-02-06");
//
//        System.out.println(date3);
//
//        LocalDateTime time1 = LocalDateTime.now();
//        System.out.println(time1);
//        System.out.println(time1.toLocalDate());
//        System.out.println(time1.toLocalTime());
//        System.out.println(OffsetDateTime.now());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String s = "06/02/2004 00:00:00";
        LocalDateTime date = LocalDateTime.parse(s,formatter);
        System.out.println(date);

        System.out.println(date.format(formatter));
    }
}
