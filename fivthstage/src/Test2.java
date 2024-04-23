public class Test2 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        double num = 153000;
        if (num == getSum(num)) {
            System.out.println("是");
        } else {
            System.out.println("不是");
        }
        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
    }

    public static int getCount(double num) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (num / Math.pow(10, i) < 1) {
                count = i;
                break;
            }
        }
        return count;
    }

    public static double getSum(double num) {
        double sum = 0;
        int count = getCount(num);
        for (int i = 1; i < count; i++) {
            sum += Math.pow(num % Math.pow(10, i), count);
        }
        System.out.println(sum);
        return sum;
    }
}
