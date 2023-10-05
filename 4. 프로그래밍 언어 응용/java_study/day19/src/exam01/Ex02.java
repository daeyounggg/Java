package exam01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ex02 {
    public static void main(String[] args) {
        String strDate = "22.03.30 23:50:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy.MM.dd HH:mm:ss");

        LocalDate date = LocalDate.parse(strDate, formatter);
        System.out.println(date);

    }
}
