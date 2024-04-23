import java.util.Date;

public class Test6 {
    public static void main(String[] args) {
        XuQu1();
        
    }

    private static void XuQu1() {
        Date date = new Date();
        long time = date.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        System.out.println(date);
        date.setTime(time);
        System.out.println(date);
    }
}
