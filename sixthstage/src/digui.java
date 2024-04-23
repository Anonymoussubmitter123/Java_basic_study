public class digui {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(JieCheng(i, 1));
    }

    public static int JieCheng(int i, int sum) {
        if (i == 0) {
            return sum;
        } else {
            sum *= i;
            return JieCheng(i - 1, sum);
        }
    }

    public static int Sum(int i, int sum) {
        if (i == 0) {
            return sum;
        } else {
            sum += i;
            return Sum(i - 1, sum);
        }
    }
}
