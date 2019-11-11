import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet {

    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            showInformations(address, "Hote local");
            address = InetAddress.getByAddress(
                    new byte[]{(byte)192, (byte)168, 2, 44}

            );
            showInformations(address,"192.168.2.44");

            address = InetAddress.getByName("localhost");
            showInformations(address,"localhost");

            address = InetAddress.getByName("127.0.0.1");
            showInformations(address,"127.0.0.1");


        }catch (UnknownHostException e){
            e.printStackTrace();
        }
    }

    public static void showInformations(InetAddress address, String name){
        System.out.println("-----------------------------");
        System.out.println("INFORMATION DE " + name);
        System.out.println("----------------------");
        System.out.println("Nom : " + address.getHostName());
        System.out.println("Address: " + address.getHostAddress());
        System.out.println("Nom canonique : " + address.getCanonicalHostName());
//        cette methode nous retourne un tableau de byte
        byte[] bAddress = address.getAddress();
        String ip = "";
        for(byte b: bAddress)
            ip +=(b& 0xFF) + "."; // L'instruction permet d'avoir la valeur non signee

        System.out.println("Adresse IP depuis tableau de byte :" + ip);
    }
}





