public class ArrayUtil {
    private ArrayUtil() {
    }

    public static String printArr(int[] arr) {
        StringBuffer sb = new StringBuffer("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i] + ",");
            }
        }
        String str = sb.append("]").toString();
        return str;
    }
    
    public static double getAverage(int[] arr) {
        double ave = 0;
        for (int i = 0; i < arr.length; i++) {
            ave += arr[i];
        }
        return ave / arr.length;
    }


}
