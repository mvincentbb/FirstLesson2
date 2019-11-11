/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MULTICAST;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author vincent
 */
public class ServeurMlct {
    
    public static void main(String args[]){
        try {
                DatagramSocket socket = new DatagramSocket();
    byte[]buf= "Hello".getBytes();
    InetAddress group = InetAddress.getByName("230.0.0.2");
    DatagramPacket packet = new DatagramPacket(buf, buf.length, group,4666);
    socket.send(packet);
        } catch (Exception e) {
        }
    }
 


    
    
}
