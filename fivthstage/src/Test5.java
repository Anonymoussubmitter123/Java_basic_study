public class Test5 {
    public static void main(String[] args) {
        String phoneNum = "13345678900";
        String email = "1288662328@qq.com";
        String num = "23012720000115221x";
        String regex3 = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";

        System.out.println(phoneNum.matches("1[3-9]\\d{9}"));
        System.out.println(email.matches("\\w+@[\\w^_]{2,6}\\.[a-zA-Z]{2,3}"));
        System.out.println(num.matches(regex3));
    }
}
