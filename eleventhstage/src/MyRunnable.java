import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {
    Socket s;

    public MyRunnable(Socket socket) {
        this.s = socket;
    }

    @Override
    public void run() {
        try {
            BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
            String src = "eleventhstage/server/" + UUID.randomUUID().toString().replace("-", "") + ".jpg";
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(src));
            int len;
            byte[] bytes = new byte[1024];
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("传输完成！");
            bw.newLine();
            bw.flush();
        } catch (IOException ex) {

        } finally {
            if (s != null) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
