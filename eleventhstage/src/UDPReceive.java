import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceive {
    public static void main(String[] args) throws IOException {
        // 接受udp数据
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp);  // 程序在这里会死等，官话：该方法是阻塞的
        byte[] data = dp.getData();
        int length = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();
        System.out.println("接受的数据" + new String(data, 0, length));
        System.out.println("数据来自" + address + "中的" + port + "端口");
        ds.close();
    }
}
