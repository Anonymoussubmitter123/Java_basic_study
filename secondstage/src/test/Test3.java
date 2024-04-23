package test;

import java.util.Scanner;

public class Test3 {
    // 判断是否为回文数
    public static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (isPalindrome(num)) {
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
