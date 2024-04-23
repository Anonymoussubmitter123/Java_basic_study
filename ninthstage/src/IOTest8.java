import java.io.*;

public class IOTest8 {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("ninthstage\\src\\b.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("ninthstage\\src\\copyb.txt"));

//        try (bis; bos) {
//            int b;
//            while ((b = bis.read()) != -1) {
//                bos.write(b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (bis; bos) {
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
