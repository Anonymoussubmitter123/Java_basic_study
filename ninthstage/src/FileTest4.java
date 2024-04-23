import java.io.File;
import java.util.Arrays;

public class FileTest4 {
    public static void main(String[] args) {
        File f1 = new File("D:\\disk\\aaa");
        System.out.println(getLen(f1));
    }

    public static long getLen(File src) {
        File[] files = src.listFiles();
        System.out.println(Arrays.toString(files));
        long len = 0;
        for (File file : files) {
            if (file.isFile()) {
                len += file.length();
            } else {
                len += getLen(file);
            }
        }
        return len;
    }
}
