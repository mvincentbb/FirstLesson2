/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UDPTEST;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author vincent
 */
public class ClientUDP {

    public static void main(String[] args) {
        try {
            InetAddress addr = InetAddress.getByName("localhost");
            DatagramSocket socket = new DatagramSocket();
            byte[] buf = "Bonjour".getBytes();
            DatagramPacket sendPacket = new DatagramPacket(buf, buf.length, addr, 4666);
            buf = new byte[256];
            DatagramPacket receivePacket = new DatagramPacket(buf, buf.length, addr, 4666);
            socket.send(sendPacket);
            socket.receive(receivePacket);
            System.out.println(new String(receivePacket.getData()));
        } catch (Exception e) {
        }

    }
}
