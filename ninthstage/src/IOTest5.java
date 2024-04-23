import java.io.*;

public class IOTest5 {
    public static void main(String[] args) throws FileNotFoundException {
        File src = new File("D:\\disk\\HTML");
        File dest = new File("ninthstage\\src\\HTML");

        try {
            copyDir(src, dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyDir(File src, File dest) throws IOException {
        dest.mkdirs();

        File[] files = src.listFiles();
        for (File file : files) {
            // if is a file
            if (file.isFile()) {
                FileInputStream fir = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));
                try (fir; fos) {
                    int len;
                    byte[] bytes = new byte[1024 * 100];
                    while ((len = fir.read(bytes)) != -1) {
                        fos.write(bytes, 0, len);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // if isn't a file
            else {
                copyDir(file, new File(dest, file.getName()));
            }
        }

    }
}
