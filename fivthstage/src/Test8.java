import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test8 {
    public static void main(String[] args) {
        jdk7();

        jdk8();
    }

    private static void jdk8() {
        LocalDate bir = LocalDate.of(2000, 1, 1);
        LocalDate today = LocalDate.now();

        long days = ChronoUnit.DAYS.between(bir, today);
        System.out.println(days);
    }

    private static void jdk7() {
        String bir = "2000年1月1日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        try {
            Date date = simpleDateFormat.parse(bir);
            long birTime = date.getTime();
            long todayTime = System.currentTimeMillis();

            long time = todayTime - birTime;
            System.out.println(time / 60 / 60 / 1000 / 24);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
