public class Test2 {
    public static void main(String[] args) {
        System.out.println(getCount(4));
    }

    public static int getCount(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return getCount(n - 1) + getCount(n - 2);
    }
}
