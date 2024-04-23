public class StringTest1 {
    public static void main(String[] args) {
        String phoneNumber = "13145668789";

        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7, 11);
        String number = start + "****" + end;
        System.out.println(number);
    }

}
