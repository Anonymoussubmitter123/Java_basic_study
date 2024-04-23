package test;

import java.util.Random;

/*是否为质数*/
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(150);
        System.out.println(number);

        for(int i = 2; i * i < number;i++){
            if(number % i == 0){
                System.out.println("不是");
                System.out.println(i);
                break;
            }
        }
    }
}
