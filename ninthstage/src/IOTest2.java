import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("ninthstage\\src\\a.txt");
        FileOutputStream fos = new FileOutputStream("ninthstage\\src\\b.txt");
        try (fis; fos) {
            long start = System.nanoTime();

//        int b;
////         只读一个一次
//        while ((b = fis.read()) != -1) {
//            fos.write(b);
//        }
            int len;
            byte[] bytes = new byte[100];
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            long end = System.nanoTime();

            System.out.println(end - start);

        } catch (IOException e) {
            e.printStackTrace();
        }
//        finally {
//            if (fos != null) {
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}
