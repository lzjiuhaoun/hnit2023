package cn.lzj66.ep8;

import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * ClassName: Demo2
 * Package: cn.lzj66.ep8
 * Description:
 *
 * @Author 工学院-liuzhaojun
 * @Create 2023/10/24 17:45
 */
public class Demo2 {
    public static void main(String[] args) {
//        LocalDate localDate = LocalDate.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalTime localTime = LocalTime.now();
        LocalDate dateStart = LocalDate.of(2021,2,3);
        LocalDate dateEnd = LocalDate.of(2023,10,25);
        System.out.println(dateStart.until(dateEnd, ChronoUnit.YEARS));
        System.out.println(dateStart.until(dateEnd, ChronoUnit.MONTHS));
        System.out.println(dateStart.until(dateEnd, ChronoUnit.DAYS));
        System.out.println(String.format("%tY年%tm月%td日", LocalDate.now(), LocalDate.now(), LocalDate.now())); //格式化三个date依次对应
        System.out.println(String.format("%tY年%<tm月%<td日", LocalDate.now())); //格式化一个date依次对应
    }
}
