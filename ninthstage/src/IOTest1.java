import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("ninthstage/src/a.txt", true);
//        fos.write(97);

        byte[] bytes = {97, 98, 99, 110, 101};
        String str = "wewrwerwrwr";
        byte[] bytes1 = str.getBytes();
        fos.write(bytes1);

        String wrap = "\r\n";
        byte[] bytes3 = wrap.getBytes();
        fos.write(bytes3);

        String str2 = "1236666";
        byte[] bytes2 = str2.getBytes();
        fos.write(bytes2, 0, 7);
        fos.close();

        FileInputStream fis = new FileInputStream("ninthstage/src/a.txt");
        int b;
//        System.out.println((char) b1);
        while ((b = fis.read()) != -1) {
            System.out.print((char) b);
        }

        fis.close();
    }
}
