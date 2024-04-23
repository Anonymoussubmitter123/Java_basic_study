import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Test4 {
    public static void main(String[] args) throws IOException {
        MulticastSocket ms = new MulticastSocket(10086);
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ms.receive(dp);
        byte[] data = dp.getData();
        int length = dp.getLength();
        String hostAddress = dp.getAddress().getHostAddress();
        String hostName = dp.getAddress().getHostName();
        System.out.println("ip:" + hostAddress + "主机名：" + hostName + "发送了数据：" + new String(data, 0, length));
        ms.close();
    }
}
