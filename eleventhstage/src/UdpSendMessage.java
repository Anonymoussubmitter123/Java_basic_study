import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UdpSendMessage {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        StringBuilder message = new StringBuilder();

        while (true) {
            String currentMessage = s.next();
            message.append(currentMessage);
            if (currentMessage.equals("886")) {
                // if is "886" ,end
                break;
            }
            byte[] bytes = message.toString().getBytes(StandardCharsets.UTF_8);
            InetAddress address = InetAddress.getByName("localhost");
            DatagramPacket dp = new DatagramPacket(bytes, 0, bytes.length, address, 10086);
            ds.send(dp);
        }
        ds.close();
    }
}
