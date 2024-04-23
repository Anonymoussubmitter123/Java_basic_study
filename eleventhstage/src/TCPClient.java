import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // 创建Socket对象，连接服务器，如果服务没开会报错，三次握手
        Socket socket = new Socket("localhost", 10086);
        OutputStream os = socket.getOutputStream();  // 可以从连接通道获取输出流
        os.write("你好!".getBytes());

        os.close();  // os运行在socket流里面，当soucket关了之后，os自动关掉，即这里可以不关
        socket.close();  // 四次挥手
    }
}
