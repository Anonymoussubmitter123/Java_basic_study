import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-QMRPP0P");
        System.out.println(address);

        String hostName = address.getHostName();
        System.out.println(hostName);
        String hostAddress = address.getHostAddress();
        System.out.println(hostAddress);
    }
}
