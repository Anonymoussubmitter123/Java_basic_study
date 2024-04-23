import java.io.*;
import java.net.Socket;

public class FileTcpClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 10086);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("eleventhstage\\client\\image.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        s.shutdownOutput();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println(br.readLine());

        s.close();
    }
}
