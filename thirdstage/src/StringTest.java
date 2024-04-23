public class StringTest {
    public static void main(String[] args) {
        String name = "wWWWWianqing12313";
        /*
        int zimuCount = 0;
        int numCount = 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            if (c >= 'A' && c <= 'z') {
                zimuCount++;
            }
            if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println(zimuCount);
        System.out.println(numCount);
        */
        String reverser = reverser(name);
        System.out.println(reverser);
    }

    public static String reverser(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
