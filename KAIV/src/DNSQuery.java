// import java.net.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.xbill.DNS.Address;
import org.xbill.DNS.ARecord;
import org.xbill.DNS.AAAARecord;

// import org.xbill.DNS.*;

public class DNSQuery {
    public static void main(String[] args) {

        String domain = "www.google.com";  // Specify the domain name you want to look up


        // InetAddress addr = Address.getByName("www.dnsjava.org");
        
        try {
            // InetAddress[] addresses = Address.getAllByName(domain);  // This retrieves all IP addresses associated with the domain
            InetAddress addr = Address.getByName("www.dnsjava.org");

            if (addr instanceof java.net.Inet4Address) {
                // If it's an IPv4 address
                System.out.println("IPv4 Address: " + addr.getHostAddress());
            } else if (addr instanceof java.net.Inet6Address) {
                // If it's an IPv6 address
                System.out.println("IPv6 Address: " + addr.getHostAddress());
            }

            // for (InetAddress inetAddress : addresses) {
            //     if (inetAddress instanceof java.net.Inet4Address) {
            //         // If it's an IPv4 address
            //         System.out.println("IPv4 Address: " + inetAddress.getHostAddress());
            //     } else if (inetAddress instanceof java.net.Inet6Address) {
            //         // If it's an IPv6 address
            //         System.out.println("IPv6 Address: " + inetAddress.getHostAddress());
            //     }
            // }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
