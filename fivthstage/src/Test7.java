public class Test7 {
    public static void main(String[] args) {
        String str = "123456789";

        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("nonono");
        } else {
            int num = 0;
            for (int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - '0';
                num = num * 10 + c;
            }
            System.out.println(num);
        }
    }
}
