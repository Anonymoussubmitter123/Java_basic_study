public class StringJoinerTest {
    public static void main(String[] args) {
        String str = "abcde";

        System.out.println(turn(str));
    }

    public static String turn(String str) {
        char[] arr = str.toCharArray();
        char first = arr[0];

        for (int i = 1; i < str.length(); i++) {
            arr[i - 1] = arr[i];
        }
        arr[str.length() - 1] = first;
        String string = new String(arr);

        return string;
    }
}
