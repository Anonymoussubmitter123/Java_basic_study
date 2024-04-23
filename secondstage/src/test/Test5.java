package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        for(int i = 0; i <22; i++ ){
            if(i % 7 == 0 || i % 10 ==7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }
    }
}
