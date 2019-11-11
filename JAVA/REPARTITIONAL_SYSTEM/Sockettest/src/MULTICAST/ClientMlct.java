/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MULTICAST;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vincent
 */
public class ClientMlct {
    
    public static void main(String[] args) {
        
      
           System.setProperty("java.net.preferIPv4Stack", "true");   
        try {
            InetAddress addr = InetAddress.getByName("230.0.0.1");
            InetSocketAddress address = new InetSocketAddress(addr, 4666);
            MulticastSocket socket = new MulticastSocket(4666);
          
            socket.joinGroup(addr);
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            System.out.println(new String(packet.getData()));
        } catch (UnknownHostException ex) {
            Logger.getLogger(ClientMlct.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ClientMlct.class.getName()).log(Level.SEVERE, null, ex);
        }
    
      
    }
    
    
    
    
}
