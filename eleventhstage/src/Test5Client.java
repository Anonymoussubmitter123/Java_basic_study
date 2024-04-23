import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Test5Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket s = new Socket("localhost", 10086);

        OutputStream os = s.getOutputStream();
        os.write("你瞅啥！".getBytes(StandardCharsets.UTF_8));
        s.shutdownOutput();
//        Thread.sleep(5000);

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }
        s.close();
    }
}
