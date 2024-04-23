import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    // 服务器
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);  // 创建ServerSocket对象
        Socket socket = ss.accept();  // 监听客户端连接,创建了服务之后等待别人来连接
//        InputStream is = socket.getInputStream();  // 从连接通道中获取输入流
//        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }
        socket.close();  // 关闭当前连接，四次挥手
        ss.close();  // 关闭服务
    }
}
