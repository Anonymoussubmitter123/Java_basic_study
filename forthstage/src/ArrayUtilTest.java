public class ArrayUtilTest {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        String str = ArrayUtil.printArr(arr);
        double average = ArrayUtil.getAverage(arr);

        System.out.println(str);
        System.out.println(average);
    }
}
