import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Test2 {
    public static void main(String[] args) throws IOException {
        // udp
        DatagramSocket ds = new DatagramSocket();  // 括号中是端口号
        String str = "nihao!";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        InetAddress address = InetAddress.getByName("localhost");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ds.send(dp);
        ds.close();
    }
}
