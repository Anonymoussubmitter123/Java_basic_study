public class Test1 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;

        System.out.println(Sheng(count, num, 12));
    }

    public static int Sheng(int count, int num, int month) {
        if (count * 3 == month) {
            return num;
        }
        num *= 2;
        count++;
        return Sheng(count, num, month);
    }
}
