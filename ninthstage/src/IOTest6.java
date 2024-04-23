import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest6 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis1 = new FileInputStream("ninthstage\\src/HTML/img/e6bc85f699043906d397fea5da2fa18.jpg");
        FileInputStream fis = new FileInputStream("ninthstage\\src/HTML/img/shenme.jpg");
        FileOutputStream fos = new FileOutputStream("ninthstage\\src/HTML/img/redu.jpg");
        int len;
        byte[] bytes = new byte[1024];
        try (fis; fos) {
            while ((len = fis.read(bytes)) != -1) {
                for (int i = 0; i < len; i++) {
                    bytes[i] ^= 10;
                }
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
