public class surch1 {
    public static void main(String[] args) {
        //int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int i = binarySearc(arr, 7);
        System.out.println(i);
    }

    /*二分查找*/
    public static int binarySearc(int[] arr, int number) {
        int max = arr.length - 1;
        int min = 0;
        int mid = min + (number - arr[min]) / (arr[max] - arr[min]) * (max - min);

        while (true) {
            if (min > max) {
                return -1;
            }
            if (arr[mid] > number) {
                max = mid - 1;
            } else if (arr[mid] < number) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
    }
}
