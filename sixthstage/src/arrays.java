import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};

//        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 100));
        int[] arr2 = Arrays.copyOf(arr, arr.length - 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr, new Comparable<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

    }
}
