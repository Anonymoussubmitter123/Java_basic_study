public class kuaisu {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};
        quickSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        if (i >= j) return; // 结束条件：待排序区间长度小于等于 1
        int start = i;
        int end = j;
        int baseNumber = arr[i];

        while (start < end) {
            while (start < end && arr[end] >= baseNumber) {
                end--;
            }
            while (start < end && arr[start] <= baseNumber) {
                start++;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        // 将基准值放到它的最终位置上
        arr[i] = arr[start];
        arr[start] = baseNumber;

        // 递归对左右两个部分进行排序
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
}
