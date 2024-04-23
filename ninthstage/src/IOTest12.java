import java.io.*;
import java.nio.charset.Charset;

public class IOTest12 {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream(new FileOutputStream("ninthstage\\src\\shenme.txt"), true, Charset.forName("UTF-8"));
        ps.println(97);
        ps.print(true);
        ps.println();
        ps.printf(" %s ", "azhan");
        ps.close();

        PrintWriter pw = new PrintWriter(new FileWriter("ninthstage\\src\\shenme.txt"), true);
        pw.println("adsfhkasdfhkaldfkaslkdfkadf");
        pw.print("adf");
        pw.close();
    }
}
