import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class Test5Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(10086);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        OutputStream os = s.getOutputStream();
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }
        os.write("瞅你咋地！".getBytes(StandardCharsets.UTF_8));
        s.close();
        ss.close();
    }
}
