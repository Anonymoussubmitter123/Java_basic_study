import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class IOTest13 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\饭碗\\java入门\\入门\\basic_study\\ninthstage\\src");
        File dest = new File("D:\\饭碗\\java入门\\入门\\basic_study\\ninthstage\\src\\HTMLjieya");
//        unzip(src, dest);
        toZip(dest, src);
    }

    public static void toZip(File src, File dest) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "HTML.zip")));
        ZipEntry zipEntry = new ZipEntry("a.txt");
        zos.putNextEntry(zipEntry);
        FileInputStream fis = new FileInputStream(src);
        int b;
        zos.closeEntry();
        zos.close();
    }


    public static void unzip(File src, File dest) throws IOException {
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        ZipEntry zipEntry;
        while ((zipEntry = zip.getNextEntry()) != null) {
            System.out.println(zipEntry);
            if (zipEntry.isDirectory()) {
                // 文件夹
                File file = new File(dest, zipEntry.toString());
                file.mkdirs();
            } else {
                FileOutputStream fos = new FileOutputStream(new File(dest, zipEntry.toString()));
                //文件
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
