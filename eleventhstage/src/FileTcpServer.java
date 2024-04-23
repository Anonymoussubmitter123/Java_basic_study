import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileTcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);
        ExecutorService pool = Executors.newCachedThreadPool();
        while (true) {
            Socket s = ss.accept();
            pool.submit(new MyRunnable(s));
        }
//        while (true) {
//            Socket s = ss.accept();
//            // 开启线程
//            new Thread(new MyRunnable(s)).start();
//        }
    }
}
