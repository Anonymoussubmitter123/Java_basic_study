package com.operator.demo1;

import java.util.Scanner;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        // 注意 hasNext 和 hasNextLine 的区别
        String s = in.next();
        String t = in.next();
        char[] s_c = new char[num];
        char[] t_c = new char[num];

        for (int i = 0; i < num; i++) {
            char c = s.charAt(i);
            s_c[i] = c;
            char d = t.charAt(i);
            t_c[i] = d;
        }
        int count = MaxCount(s_c, t_c);
        System.out.print(count);
    }

    public static int Count(char[] s_c, char[] t_c) {
        int count = 0;
        for (int i = 0; i < s_c.length; i++) {
            if (s_c[i] == t_c[i]) {
                count++;
            }
        }
        return count;
    }

    public static int MaxCount(char[] s_c, char[] t_c) {
        int src_count = Count(s_c, t_c);
        int flag = 0;
        char[] s = s_c;
        char[] t = t_c;
        for (int i = 0; i < s_c.length; i++) {
            for (int j = i; j < s_c.length; j++) {
                char temp = t_c[i];
                t_c[i] = t_c[j];
                t_c[j] = temp;
                if (Count(s_c, t_c) - src_count == 2) {
                    return src_count + 2;
                } else if (Count(s_c, t_c) - src_count == 1) {
                    flag = 1;
                    s_c = s;
                    t_c = t;
                } else {
                    s_c = s;
                    t_c = t;
                }
            }
        }
        if (flag == 1) {
            return src_count + 1;
        } else {
            return src_count;
        }
    }
}