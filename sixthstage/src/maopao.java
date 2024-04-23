public class maopao {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18, 32, 23, 37, 26, 45, 34, 50, 48, 61, 52, 73, 66};
        int flag = arr[0];

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    flag = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = flag;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
