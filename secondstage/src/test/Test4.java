package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chuShu =  scanner.nextInt();
        int beiChuShu = scanner.nextInt();
        int shang = 0, yvShu = 0;

        while (chuShu <= beiChuShu){
            beiChuShu -= chuShu;
            shang += 1;
        }
        yvShu = beiChuShu;
        System.out.println(shang);
        System.out.println(yvShu);
    }
}
