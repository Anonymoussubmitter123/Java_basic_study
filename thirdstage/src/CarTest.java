import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            car.setName(scanner.next());
            car.setPrice(scanner.nextInt());
            car.setColor(scanner.next());
        }
    }
}
