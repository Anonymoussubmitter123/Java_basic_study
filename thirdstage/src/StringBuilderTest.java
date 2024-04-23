import java.util.Scanner;

public class StringBuilderTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        String string = new StringBuilder(str).reverse().toString();
        if (string.equals(str)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
    }
}
