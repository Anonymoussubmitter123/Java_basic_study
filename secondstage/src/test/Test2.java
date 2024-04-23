package test;

import java.util.Scanner;

public class Test2 {
    /*小美正在设计美团外卖的定价信息。已知外卖定价的规则如下：
1. 每道菜有折扣价和原价。折扣价不能超过原价。
2. 订单有满
�
x元减
�
y元的优惠。当购买的菜的价格总和不小于
�
x元时，总价格可以减
�
y元。“减”的价格不能超过“满”的价格。
3. 满减优惠和折扣价是互斥的，当且仅当每个菜都选择了原价才可以触发满减。
4. 系统会自动为客户计算最低价格的方案。 */
// 注意类名必须为 Main, 不要有任何 package xxx 信息
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0;
        double sum_z = 0;
        int flag = in.nextInt();
        try {
            // 注意 hasNext 和 hasNextLine 的区别
            while (flag > 0) { // 注意 while 处理多个 case
                double a = in.nextDouble();
                double b = in.nextDouble();

                if (b > a) {
                    throw new Exception("error");
                }
                sum += a;
                sum_z += b;
                flag--;
            }
            double x = in.nextDouble();
            double y = in.nextDouble();

            if (sum >= x) {
                sum -= y;
            }
            double min = 0;
            if (sum < sum_z) {
                min = sum;
            } else {
                min = sum_z;
            }
            System.out.println(String.format("%.2f", min));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
