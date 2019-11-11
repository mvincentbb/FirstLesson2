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
public class ServeurUDP {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket(4666);
            byte[] sendbuf = null;
            byte[] receivebuf = new byte[256];
            DatagramPacket receivepacket = new DatagramPacket(receivebuf, receivebuf.length);
            DatagramPacket sendPacket = null;
            System.out.println("Serveur prêt");
            while (true) {
                socket.receive(receivepacket);
// On affiche le contenu du paquet reçu
                System.out.println(new String(receivepacket.getData()));
// On envoie en réponse un message indiquant d’où vient l'appel en // transformant la chaîne de caractères en octets
                InetAddress addr = receivepacket.getAddress();
                int port = receivepacket.getPort();
                sendbuf = ("Vous êtes connecté depuis la machine " + addr + "et sur le port " + port).getBytes();
                sendPacket = new DatagramPacket(sendbuf, sendbuf.length, addr, port);
                socket.send(sendPacket);
            }

        } catch (Exception e) {
        }

    }

}
