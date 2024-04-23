import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class IOTest3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "我剑也未尝不利";
        // 1编码
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));

        byte[] bytes2 = s.getBytes("GBK");
        System.out.println(Arrays.toString(bytes2));
        // 2解码
        String s2 = new String(bytes);
        System.out.println(s2);

        String s1 = new String(bytes2, "GBK");
        System.out.println(s1);
    }
}
