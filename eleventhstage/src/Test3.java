import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.charset.StandardCharsets;

public class Test3 {
    public static void main(String[] args) throws IOException {
        // 组播
        MulticastSocket ms = new MulticastSocket();
        String str = "nihao!";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        InetAddress address = InetAddress.getByName("224.0.0.1");
        int port = 10086;

        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);
        ms.send(dp);
        ms.close();
    }
}
