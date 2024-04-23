import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class IOTest10 {
    public static void main(String[] args) throws IOException {
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("ninthstage\\src\\shenme.txt"), "utf-8");
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.println((char) ch);
//        }
//        isr.close();
        FileReader fr = new FileReader("ninthstage\\src\\shenme.txt", Charset.forName("utf-8"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.println((char) ch);
        }
        fr.close();

//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("ninthstage\\src\\bushiba.txt"), "utf-8");
//        osw.write("nihao");
//        osw.close();
        FileWriter fw = new FileWriter("ninthstage\\src\\shenme.txt", Charset.forName("utf-8"));
        fw.write("nihaoma1");
        fw.close();
    }
}
