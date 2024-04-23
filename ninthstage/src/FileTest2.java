import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileTest2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\disk\\aaa\\c.txt");
        File f2 = new File("D:\\disk\\aaa");
        System.out.println(f1.createNewFile());
//        System.out.println(f2.createNewFile());
//        System.out.println(f2.mkdirs());
//        System.out.println(f1.delete());
        for (File file : f2.listFiles()) {
            System.out.println(file);
        }

        System.out.println(Arrays.toString(File.listRoots()));

        String[] arr = f2.list((dir, name) -> true);
        System.out.println(Arrays.toString(arr));
    }
}
